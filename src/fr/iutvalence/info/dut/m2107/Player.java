package fr.iutvalence.info.dut.m2107;

/**
 * This represents the player
 * 
 * @author Nico
 */
public class Player
{
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
	private int numberOfTroop;
	
	/**
	 * This represents a player ready to play
	 */
	public Player(String name, FactionType faction, int nbTroop)
	{
		this.name = name;
		this.faction = faction;
		this.numberOfTroop = nbTroop;
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
	public int getNumberOfTroop()
	{
		return this.numberOfTroop;
	}

	/**
	 * Set the number of troop
	 * @param numberOfTroop
	 */
	public void setNumberOfTroop(int numberOfTroop)
	{
		this.numberOfTroop = numberOfTroop;
		if(numberOfTroop < 0)
			this.numberOfTroop = 0;
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
	
	// TODO Completer
	/**
	 * This represent the strengthening phase of a player's turn which is required 
	 */
	public void strengthening()
	{
		
	}
}