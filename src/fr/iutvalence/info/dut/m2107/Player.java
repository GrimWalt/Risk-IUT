package fr.iutvalence.info.dut.m2107;

/**
 * this represents the player.
 * 
 * @author Nico
 */
public class Player
{
	/**
	 * this represents the player's name
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
	 * this represents a player ready to play
	 */
	public Player(String name, FactionType faction, int nbTroop)
	{
		this.name = name;
		this.faction = faction;
		this.numberOfTroop = nbTroop;
	}
	
	public String getName()
	{
		return this.name;
	}

	public FactionType getFaction()
	{
		return this.faction;
	}

	public int getNumberOfTroop()
	{
		return this.numberOfTroop;
	}

	public void setNumberOfTroop(int numberOfTroop)
	{
		this.numberOfTroop = numberOfTroop;
		if(numberOfTroop < 0)
			this.numberOfTroop = 0;
	}
	
	// (TODO) Completer 
	public void attack(Room targetRoom)
	{
		
	}
	
	// (TODO) Completer 
	public void moveTroops(Room startRoom, Room endRoom, int nbTroop)
	{
		
	}
	
	// (TODO) Completer 
	public void strengthening()
	{
		
	}
}