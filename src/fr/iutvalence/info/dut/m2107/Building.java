package fr.iutvalence.info.dut.m2107;

// TODO Add Javadoc
public class Building
{
	// TODO Add Javadoc
	private final Room[] rooms;
	
	// TODO Add Javadoc
	private final String name;
	
	// TODO Add Javadoc
	private final int bonus;

	// TODO Add Javadoc
	public Building(Room[] rooms, String name, int bonus)
	{
		this.rooms = rooms;
		this.name = name;
		this.bonus = bonus;
	}
	
	// TODO Add Javadoc
	public String getName()
	{
		return this.name;
	}
	
	// TODO Add Javadoc
	public Room[] getRooms()
	{
		return this.rooms;
	}
	
	// TODO Add Javadoc
	public boolean isPlayerControlAllRooms(Player player)
	{
		for(int roomIndex = 0 ; roomIndex < this.rooms.length ; roomIndex++)
		{
			if(this.rooms[roomIndex].getController() != player)
				return false;
		}
		return true;
	}
	
	// TODO Add Javadoc
	public void allowBonus(Player player)
	{
		if(this.isPlayerControlAllRooms(player));
			player.setNumberOfTroop(player.getNumberOfTroop() + this.bonus);
	}
}
