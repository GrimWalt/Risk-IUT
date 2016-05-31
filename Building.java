package fr.iutvalence.info.dut.m2107;

/**
 * This represents a building on the map 
 */
public class Building
{
	/**
	 * This represents all the rooms which compose the building
	 */
	private final Room[] rooms;

	/**
	 * This represents the name of the building (a letter)
	 */
	private final String name;
	
	/**
	 * This represents the bonus of the building (you get it when you control all rooms of the building)
	 */
	private final int bonus;

	/**
	 * This represents a building ready to be conquered
	 * @param rooms 	All rooms which compose the building
	 * @param name 		The building's name
	 * @param bonus 	The building's bonus
	 */
	public Building(Room[] rooms, String name, int bonus)
	{
		this.rooms = rooms;
		this.name = name;
		this.bonus = bonus;
	}

	/**
	 * @return name		The building's name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return rooms	All the rooms of a building
	 */
	public Room[] getRooms()
	{
		return this.rooms;
	}

	/**
	 * Check if a player controls all rooms of the building
	 * @param player 	The player who is checked
	 * @return boolean 	true 	The player control all the rooms
	 * 					false 	the player do not control all the rooms
	 */
	public boolean isPlayerControlAllRooms(Player player)
	{
		for(int roomIndex = 0 ; roomIndex < this.rooms.length ; roomIndex++)
		{
			if(this.rooms[roomIndex].getController() != player)
				return false;
		}
		return true;
	}

	/**
	 * Give the additional troops to a player if he controls all rooms of a building
	 * @param player 	The player who receive the bonus
	 */
	public void allowBonus(Player player)
	{
		if(this.isPlayerControlAllRooms(player));
			player.setAmountOfTroop(player.getAmountOfTroop() + this.bonus);
	}
}
