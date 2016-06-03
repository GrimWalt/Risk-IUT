package fr.iutvalence.info.dut.m2107;

/**
 * This represent a room of a building 
 * @author prevostn
 */
public class Room
{
	/**
	 * This represent the room's name
	 */
	private final String name;
	
	/**
	 * This represent the building's name which contain the room
	 */
	private final String buildingName;
	
	/**
	 * This represent the player who control the room
	 */
	private Player controller;
	
	/**
	 * This represents the number of troops which are on the room.
	 */
	private int nbTroops;
	
	/**
	 * Create a room uncontrolled (without a controller)
	 * @param name The room's name
	 * @param buildingName The name of the building where the room is
	 */
	public Room(String name, String buildingName)
	{
		this.name = name;
		this.buildingName = buildingName;
	}
	
	/**
	 * Create a room controlled by a player (with a controller)
	 * @param name The room's name
	 * @param buildingName The room's name
	 * @param controller The room's controller
	 */
	public Room(String name, String buildingName, Player controller)
	{
		this.name = name;
		this.buildingName = buildingName;
		this.controller = controller;
	}

	/**
	 * @return controller : The room's controller
	 */
	public Player getController()
	{
		return this.controller;
	}

	/**
	 * Sets the room's controller
	 * @param controller The player who will controls the room
	 */
	public void setController(Player controller)
	{
		this.controller = controller;
	}

	/**
	 * @return name : The room's name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * @return buildingName : The building's name
	 */
	public String getBuildingName()
	{
		return this.buildingName;
	}
	
	/**
	 * Getter for nbTroops
	 * @return nbTroops : The number of troops which are on the room
	 */
	public int getNbTroops()
	{
		return this.nbTroops;
	}
	
	/**
	 * setter for nbTroops
	 * @param nbTroops The new number of troops which will be on the room
	 */
	public void setNbTroops(int nbTroops)
	{
		this.nbTroops = nbTroops;
	}
}