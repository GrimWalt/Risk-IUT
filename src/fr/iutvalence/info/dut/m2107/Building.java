package fr.iutvalence.info.dut.m2107;

public class Building
{
	private final Room[] rooms;
	
	private final String name;
	
	private final int bonus;

	public Building(Room[] rooms, String name, int bonus)
	{
		this.rooms = rooms;
		this.name = name;
		this.bonus = bonus;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Room[] getRooms()
	{
		return this.rooms;
	}
	
	public boolean isPlayerControlAllRooms(Player player)
	{
		for(int roomIndex = 0 ; roomIndex < this.rooms.length ; roomIndex++)
		{
			if(this.rooms[roomIndex].getController() != player)
				return false;
		}
		return true;
	}
	
	public void allowBonus(Player player)
	{
		if(this.isPlayerControlAllRooms(player));
			player.setNumberOfTroop(player.getNumberOfTroop() + this.bonus);
	}
}
