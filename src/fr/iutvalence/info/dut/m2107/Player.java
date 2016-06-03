package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

/**
 * This represents the player
 * 
 * @author Nico
 */
public class Player
{
	/**
	 * 
	 */
	public static final int INITIAL_AMOUNT_OF_TROOP = 32;
	
	/**
	 * 
	 */
	public static final int DEFAULT_NUMBER_OF_TROOPS_TO_ATTACK = 1;
	
	/**
	 * This represents the player's name
	 */
	private final String name;
	
	/**
	 * This represents the player's faction
	 */
	private final FactionType faction;
	
	/**
	 * This represents the troop number of a player
	 */
	private int amountOfTroop;
	
	/**
	 * This represents the player's number
	 */
	private int playerNumber;
	
	/**
	 * This represent an input stream which allow player to choose his faction or his name
	 */
	private Scanner playerInput;
	
	/**
	 * This represents a player ready to play
	 * @param playerNumber This represent the number of the player
	 * @throws InvalidPlayerNumberException If playerNumber < 1
	 */
	public Player(int playerNumber) throws InvalidPlayerNumberException
	{
		if(playerNumber < 1)
			throw new InvalidPlayerNumberException();
		this.playerInput = new Scanner(System.in);
		this.name = this.askForName();
		this.faction = this.askForFaction();
		this.playerNumber = playerNumber;
		this.amountOfTroop = INITIAL_AMOUNT_OF_TROOP;
	}
	
	/**
	 * @return name : The player's name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return faction : The player's faction
	 */
	public FactionType getFaction()
	{
		return this.faction;
	}

	/**
	 * @return numberOfTroop : The player's number of troop
	 */
	public int getAmountOfTroop()
	{
		return this.amountOfTroop;
	}

	/**
	 * Set the number of troop
	 * @param amountOfTroop The new amount of troop
	 */
	public void setAmountOfTroop(int amountOfTroop)
	{
		this.amountOfTroop = amountOfTroop;
		if(amountOfTroop < 0)
			this.amountOfTroop = 0;
	}
	
	// TODO Completer 
	/**
	 * Attack a room which is controlled by another player in order to control it
	 * @param targetRoom Must be beside the strikerRoom, strikerRoom must have a link with the targetRoom thanks to the RiskGame.DEFAULT_LINKS
	 * @param strikerRoom The attacker's room
	 */
	public void attack(Room targetRoom, int numberOfTroops, Room strikerRoom)
	{
		int nbAttackingTroops = 0;
		int nbDefendingTroops = 0;
		int attScore = 0;
		int defScore = 0;
		while (numberOfTroops > 0)
		{
			//INIT FIGHT
			if(numberOfTroops > 2)
				nbAttackingTroops = 3;
			else
				nbAttackingTroops = numberOfTroops;
			
			if (targetRoom.getNbTroops() > 1)
				nbDefendingTroops = 2;
			else
				nbDefendingTroops = targetRoom.getNbTroops();
			
			//REKT PHASE
			while (nbAttackingTroops != 0 && nbDefendingTroops != 0)
			{
				attScore = diceThrowing();
				defScore = diceThrowing();
				
				if(defScore >= attScore)
					nbAttackingTroops--;
				else
					nbDefendingTroops--;		
			}
			
			if (nbAttackingTroops == 0)
				System.out.println("ATTACKING BITCH HAS BEEN REKTERINO");
			else
				System.out.println("REST IN PEPPERONI DEFENDERINO");
		}
		
		if (numberOfTroops == 0)
		{
			System.out.println("YOU JUST BUTT FUCK THE ATTACKERS SNEAKY BEAKY LIKE !! GGWP SUCKERS");
			System.out.println("YOUR WHOLE ATTACK IS A DISASTER");
		}
		else
		{
			System.out.println("THE ATTACKING BARBARIANS JUST RAPE AND MURDERED YOUR WHOLE FAMILLY !!! GET REKT PUSSY");
			targetRoom.setController(this);
			targetRoom.setNbTroops(numberOfTroops);
		}		
	}
	
	// TODO Completer 
	/**
	 * Move the nbTroop of the startRoom to the endRoom
	 * @param startRoom The room where player wants to remove troops, the numberOfTroop of this room must be higher than 0
	 * @param endRoom The room where player wants to add troops, the numberOfTroop of this room must be higher than 0 
	 * @param nbTroop The number of troop which the player wants to move
	 */
	public void moveTroops(Room startRoom, Room endRoom, int nbTroop) throws NotYourRoomException
	{
		if(startRoom.getController()!=endRoom.getController())
			throw new NotYourRoomException();

		startRoom.setNbTroops(startRoom.getNbTroops()-nbTroop);
		endRoom.setNbTroops(endRoom.getNbTroops()-nbTroop);
	}
	
	//TODO Completer
	/**
	 * This represent the strengthening phase of a player's turn which is required 
	 */
	public void firstStrengthening()
	{
		//Use a function in interface to set the new troops
		setAmountOfTroop(INITIAL_AMOUNT_OF_TROOP);
	}
	
	// TODO Completer
	/**
	 * This represent the strengthening phase of a player's turn which is required 
	 */
	public void strengthening()
	{
		this.setAmountOfTroop(getAmountOfTroop() + (int) Math.floor(howManyRoomControlled() *1.5));
	}
	
	/**
	 * Ask to the player to write his name.
	 * @return name : The name of the player
	 */
	private String askForName()
	{
		System.out.print("Name : ");
		String name = this.playerInput.nextLine();
		
		return name;
	}
	
	/**
	 * Ask the faction which the player wants to use.
	 * @return faction : The faction of the player
	 */
	private FactionType askForFaction()
	{
		int randFaction = (int) Math.floor(4*Math.random()+1);
		FactionType faction = null;

		switch(randFaction)
		{
			case 1:
				faction = FactionType.GEA;
				break;
			case 2:
				faction = FactionType.INFO;
				break;
			case 3:
				faction = FactionType.RT;
				break;
			case 4:
				faction = FactionType.TC;
				break;
		}
		return faction;
	}
	
	/**
	 * Gives the number of room controlled by the player
	 * @return nbRoomControlled : This represents the number of room which are controlled by the player
	 */
	public int howManyRoomControlled()
	{
				
		int nbRoomControlled = 0;
		
		for (int i = 0;i < Board.BUILDINGS.length;i++)
		{
			for (int j = 0;j < Board.BUILDINGS[i].getRooms().length;j++)
			{
				if(this == Board.BUILDINGS[i].getRooms()[j].getController())
				{
					nbRoomControlled++;
				}
			}
			
		}
		return nbRoomControlled;
	}
	
	/**
	 * Throw a dice of 6 faces
	 * @return the result of a 6 faces dice
	 */
	public int diceThrowing()
	{
		int i =  (int)(Math.floor(Math.random()) * 6 + 1);
		return i;
	}
}
