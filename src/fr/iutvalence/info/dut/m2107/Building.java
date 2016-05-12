package fr.iutvalence.info.dut.m2107;

public class Building
{
	private final Room[] rooms;
	
	private final String name;

	public Building(Room[] rooms, String name)
	{
		this.rooms = rooms;
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Room[] getRooms()
	{
		return this.rooms;
	}
}
