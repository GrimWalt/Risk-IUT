package fr.iutvalence.info.dut.m2107;

public class Room
{
	private final String name;
	
	private final String buildingName;
	
	private Player controller;
	
	public Room(String name, String buildingName)
	{
		this.name = name;
		this.buildingName = buildingName;
	}
	
	public Room(String name, String buildingName, Player controller)
	{
		this.name = name;
		this.buildingName = buildingName;
		this.controller = controller;
	}

	public Player getController()
	{
		return controller;
	}

	public void setController(Player controller)
	{
		this.controller = controller;
	}

	public String getName()
	{
		return name;
	}

	public String getBuildingName()
	{
		return buildingName;
	}
}
