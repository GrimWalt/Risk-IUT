package fr.iutvalence.info.dut.m2107;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This represents a game of Risk
 */
public class RiskGame
{
	/**
	 * This represents all players who plays the game
	 */
	private final Player[] joueurs;
	
	/**
	 * This represents the default links between the different rooms
	 */
	private final static Map<Room, Set<Room>> DEFAULT_LINKS = createMap();
	
	/**
	 * This represents a Risk game with players ready to play
	 * @param nbJoueurs
	 */
	public RiskGame(int nbJoueurs)
	{
		this.joueurs = new Player[nbJoueurs];
	}

	/**
	 * This method plays the game
	 */
	public void play()
	{
		System.out.println("Game started");
		
		
		
		System.out.println("Game finished");
	}
	
	/**
	 * This represents the final cells of the board on a hashmap
	 * @return An unmodifiable map
	 */
	private static Map<Room, Set<Room>> createMap()
	{
        Map<Room, Set<Room>> result = new HashMap<Room, Set<Room>>();
        
        // Liaisons Bâtiment A
        result.put(Board.BUILDINGS[0].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[1]));
        result.put(Board.BUILDINGS[0].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[0], Board.BUILDINGS[0].getRooms()[2], Board.BUILDINGS[1].getRooms()[5]));
        result.put(Board.BUILDINGS[0].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[1], Board.BUILDINGS[0].getRooms()[3], Board.BUILDINGS[5].getRooms()[1]));
        result.put(Board.BUILDINGS[0].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[2], Board.BUILDINGS[0].getRooms()[4], Board.BUILDINGS[0].getRooms()[7], Board.BUILDINGS[0].getRooms()[9]));
        result.put(Board.BUILDINGS[0].getRooms()[4], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[3], Board.BUILDINGS[0].getRooms()[5], Board.BUILDINGS[0].getRooms()[6]));
        result.put(Board.BUILDINGS[0].getRooms()[5], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[4]));
        result.put(Board.BUILDINGS[0].getRooms()[6], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[4]));
        result.put(Board.BUILDINGS[0].getRooms()[7], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[3], Board.BUILDINGS[0].getRooms()[9], Board.BUILDINGS[0].getRooms()[8]));
        result.put(Board.BUILDINGS[0].getRooms()[8], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[7], Board.BUILDINGS[0].getRooms()[9]));
        result.put(Board.BUILDINGS[0].getRooms()[9], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[7], Board.BUILDINGS[0].getRooms()[8], Board.BUILDINGS[3].getRooms()[0]));
        
        // Liaisons Bâtiment B
        result.put(Board.BUILDINGS[1].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[1].getRooms()[1]));
        result.put(Board.BUILDINGS[1].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[0], Board.BUILDINGS[1].getRooms()[2]));
        result.put(Board.BUILDINGS[1].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[1], Board.BUILDINGS[1].getRooms()[3]));
        result.put(Board.BUILDINGS[1].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[2], Board.BUILDINGS[1].getRooms()[4], Board.BUILDINGS[4].getRooms()[0]));
        result.put(Board.BUILDINGS[1].getRooms()[4], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[3], Board.BUILDINGS[1].getRooms()[5]));
        result.put(Board.BUILDINGS[1].getRooms()[5], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[4], Board.BUILDINGS[1].getRooms()[6], Board.BUILDINGS[0].getRooms()[1]));
        result.put(Board.BUILDINGS[1].getRooms()[6], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[5]));
        
        // Liaisons Bâtiment C
        result.put(Board.BUILDINGS[2].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[1], Board.BUILDINGS[3].getRooms()[3]));
        result.put(Board.BUILDINGS[2].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[0], Board.BUILDINGS[2].getRooms()[2]));
        result.put(Board.BUILDINGS[2].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[1], Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[5].getRooms()[0]));
        result.put(Board.BUILDINGS[2].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[4], Board.BUILDINGS[1].getRooms()[0]));
        result.put(Board.BUILDINGS[2].getRooms()[4], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[4].getRooms()[0]));
        
        // Liaisons Bâtiment D
        result.put(Board.BUILDINGS[3].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[9], Board.BUILDINGS[3].getRooms()[1]));
        result.put(Board.BUILDINGS[3].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[0], Board.BUILDINGS[3].getRooms()[2], Board.BUILDINGS[5].getRooms()[1]));
        result.put(Board.BUILDINGS[3].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[1], Board.BUILDINGS[3].getRooms()[3]));
        result.put(Board.BUILDINGS[3].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[2], Board.BUILDINGS[2].getRooms()[0]));
        
        // Liaisons Bâtiment E
        result.put(Board.BUILDINGS[4].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[2], Board.BUILDINGS[4].getRooms()[1], Board.BUILDINGS[1].getRooms()[3], Board.BUILDINGS[2].getRooms()[4]));
        result.put(Board.BUILDINGS[4].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[0]));
        result.put(Board.BUILDINGS[4].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[0], Board.BUILDINGS[4].getRooms()[3]));
        result.put(Board.BUILDINGS[4].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[2]));
        
        // Liaisons Bâtiment CV
        result.put(Board.BUILDINGS[5].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[5].getRooms()[1], Board.BUILDINGS[2].getRooms()[2]));
        result.put(Board.BUILDINGS[5].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[5].getRooms()[0], Board.BUILDINGS[3].getRooms()[1], Board.BUILDINGS[0].getRooms()[2]));
        
        return Collections.unmodifiableMap(result);
	}
	
	/**
	 * Creates a set of one room to create the map
	 * @param roomOne
	 * @return this set
	 */
	private static Set<Room> createSet(Room roomOne)
	{
		Set<Room> aSet = new HashSet();
		
		aSet.add(roomOne);
		
		return aSet;
	}
	
	/**
	 * Creates a set of two rooms to create the map
	 * @param roomOne
	 * @param roomTwo
	 * @return this set
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo)
	{
		Set<Room> aSet = new HashSet(); 
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		
		return aSet;
	}
	
	/**
	 * Creates a set of three rooms to create the map
	 * @param roomOne
	 * @param roomTwo
	 * @param roomThree
	 * @return this set
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo, Room roomThree)
	{
		Set<Room> aSet = new HashSet();
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		aSet.add(roomThree);
		
		return aSet;
	}
	
	/**
	 * Creates a set of four rooms to create the map
	 * @param roomOne
	 * @param roomTwo
	 * @param roomThree
	 * @param roomFour
	 * @return this set
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo, Room roomThree, Room roomFour)
	{
		Set<Room> aSet = new HashSet();
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		aSet.add(roomThree);
		aSet.add(roomFour);
		
		return aSet;
	}
	
}