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
	 * Create a room uncontrolled (without a controller)
	 * 
	 * @param name
	 * @param buildingName
	 */
	public Room(String name, String buildingName)
	{
		this.name = name;
		this.buildingName = buildingName;
	}
	
	/**
	 * Create a room controlled by a player (with a controller)
	 * 
	 * @param name
	 * @param buildingName
	 * @param controller
	 */
	public Room(String name, String buildingName, Player controller)
	{
		this.name = name;
		this.buildingName = buildingName;
		this.controller = controller;
	}

	/**
	 * @return controller The room's controller
	 */
	public Player getController()
	{
		return controller;
	}

	/**
	 * Set the room's controller
	 * @param controller
	 */
	public void setController(Player controller)
	{
		this.controller = controller;
	}

	/**
	 * @return name The room's name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * @return buildingName The building's name
	 */
	public String getBuildingName()
	{
		return this.buildingName;
	}
}
