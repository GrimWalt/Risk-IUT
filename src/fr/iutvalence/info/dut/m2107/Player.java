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
	 * @return name The player's name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return faction The player's faction
	 */
	public FactionType getFaction()
	{
		return this.faction;
	}

	/**
	 * @return numberOfTroop The player's number of troop
	 */
	public int getAmountOfTroop()
	{
		return this.amountOfTroop;
	}

	/**
	 * Set the number of troop
	 * @param numberOfTroop
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
	public void attack(Room targetRoom, Room strikerRoom)
	{
		
	}
	
	// TODO Completer 
	/**
	 * Move the nbTroop of the startRoom to the endRoom
	 * @param startRoom The room where player wants to remove troops, the numberOfTroop of this room must be higher than 0
	 * @param endRoom The room where player wants to add troops, the numberOfTroop of this room must be higher than 0 
	 * @param nbTroop The number of troop which the player wants to move
	 */
	public void moveTroops(Room startRoom, Room endRoom, int nbTroop)
	{
		
	}
	
	//TODO Completer
	/**
	 * This represent the strengthening phase of a player's turn which is required 
	 */
	public void firstStrengthening()
	{
		//TODO Increase number of troops of players
		
	}
	
	// TODO Completer
	/**
	 * This represent the strengthening phase of a player's turn which is required 
	 */
	public void strengthening()
	{
		
	}
	
	private String askForName()
	{
		System.out.print("Name : ");
		String name = this.playerInput.nextLine();
		
		return name;
	}

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
}
