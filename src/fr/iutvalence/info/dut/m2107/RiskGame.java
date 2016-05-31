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
	 * This represent the current player when the game is beginning
	 */
	public static final int INITIAL_CURRENT_PLAYER = 0;
	
	/**
	 * This represents all players who plays the game
	 */
	private final Player[] joueurs;

	/**
	 * This represents the default links between the different rooms
	 */
	private final static Map<Room, Set<Room>> DEFAULT_LINKS = createMap();

	/**
	 * This represents the number of the currentPlayer.
	 */
	private int currentPlayer;
	
	/**
	 * This represents a Risk game with players ready to play
	 * @param nbJoueurs 	The number of player who plays the game
	 */
	public RiskGame(int nbJoueurs)
	{
		this.joueurs = new Player[nbJoueurs];
		for(int joueurIndex = 0 ; joueurIndex < nbJoueurs ; joueurIndex++)
		{
			try
			{
				this.joueurs[joueurIndex] = new Player(joueurIndex+1);
			}
			catch (InvalidPlayerNumberException e)
			{
				e.printStackTrace();
			}
		}
		this.currentPlayer = INITIAL_CURRENT_PLAYER;
	}

	/**
	 * This method plays the game
	 * 
	 * firstStrengthening() // TODO : add this method
	 * while !isGameOver()
	 * 	{
	 * 		strengthening(we will see)
	 * 		moveTroops(we will see)
	 * 		attack(we will see)
	 * 		switchPlayer()
	 * }
	 */
	public void play()
	{
		System.out.println("Game started");
		
		while(this.currentPlayer!=this.joueurs.length-1)
		{
			this.joueurs[this.currentPlayer].firstStrengthening();
			this.switchPlayer();
		}
			
		while(!isGameOver())
		{
			this.currentPlayer = 0;
			this.joueurs[this.currentPlayer].strengthening();
			this.joueurs[this.currentPlayer].moveTroops(null, null, this.currentPlayer);
			this.joueurs[this.currentPlayer].attack(null, null);
			this.switchPlayer();
		}
		
		for(int i = 0 ; i < this.joueurs.length ; i++)
		{
			System.out.println("Name : "+this.joueurs[i].getName()+"\nFaction : "+this.joueurs[i].getFaction());
		}

		
		System.out.println("Game finished");
	}
	
	/**
	 * This method is used for switch the players.
	 */
	private void switchPlayer()
	{
		if(this.currentPlayer == this.joueurs.length-1)
			this.currentPlayer = 0;
		else
			this.currentPlayer++;		
	}
	
	/**
	 * @return boolean	true	the game is over
	 * 					false	the game is not over
	 */
	public boolean isGameOver()
	{
		//TODO compléter
		return false;
	}
	
	/**
	 * Creates a new hashMap which represents all links between rooms
	 * @return result 	An unmodifiable map
	 */
	private static Map<Room, Set<Room>> createMap()
	{
        Map<Room, Set<Room>> result = new HashMap<Room, Set<Room>>();
        
        // Liaisons BÃ¢timent A
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
        
        // Liaisons BÃ¢timent B
        result.put(Board.BUILDINGS[1].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[1].getRooms()[1]));
        result.put(Board.BUILDINGS[1].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[0], Board.BUILDINGS[1].getRooms()[2]));
        result.put(Board.BUILDINGS[1].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[1], Board.BUILDINGS[1].getRooms()[3]));
        result.put(Board.BUILDINGS[1].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[2], Board.BUILDINGS[1].getRooms()[4], Board.BUILDINGS[4].getRooms()[0]));
        result.put(Board.BUILDINGS[1].getRooms()[4], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[3], Board.BUILDINGS[1].getRooms()[5]));
        result.put(Board.BUILDINGS[1].getRooms()[5], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[4], Board.BUILDINGS[1].getRooms()[6], Board.BUILDINGS[0].getRooms()[1]));
        result.put(Board.BUILDINGS[1].getRooms()[6], RiskGame.createSet(Board.BUILDINGS[1].getRooms()[5]));
        
        // Liaisons BÃ¢timent C
        result.put(Board.BUILDINGS[2].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[1], Board.BUILDINGS[3].getRooms()[3]));
        result.put(Board.BUILDINGS[2].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[0], Board.BUILDINGS[2].getRooms()[2]));
        result.put(Board.BUILDINGS[2].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[1], Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[5].getRooms()[0]));
        result.put(Board.BUILDINGS[2].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[4], Board.BUILDINGS[1].getRooms()[0]));
        result.put(Board.BUILDINGS[2].getRooms()[4], RiskGame.createSet(Board.BUILDINGS[2].getRooms()[3], Board.BUILDINGS[4].getRooms()[0]));
        
        // Liaisons BÃ¢timent D
        result.put(Board.BUILDINGS[3].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[0].getRooms()[9], Board.BUILDINGS[3].getRooms()[1]));
        result.put(Board.BUILDINGS[3].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[0], Board.BUILDINGS[3].getRooms()[2], Board.BUILDINGS[5].getRooms()[1]));
        result.put(Board.BUILDINGS[3].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[1], Board.BUILDINGS[3].getRooms()[3]));
        result.put(Board.BUILDINGS[3].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[3].getRooms()[2], Board.BUILDINGS[2].getRooms()[0]));
        
        // Liaisons BÃ¢timent E
        result.put(Board.BUILDINGS[4].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[2], Board.BUILDINGS[4].getRooms()[1], Board.BUILDINGS[1].getRooms()[3], Board.BUILDINGS[2].getRooms()[4]));
        result.put(Board.BUILDINGS[4].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[0]));
        result.put(Board.BUILDINGS[4].getRooms()[2], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[0], Board.BUILDINGS[4].getRooms()[3]));
        result.put(Board.BUILDINGS[4].getRooms()[3], RiskGame.createSet(Board.BUILDINGS[4].getRooms()[2]));
        
        // Liaisons BÃ¢timent CV
        result.put(Board.BUILDINGS[5].getRooms()[0], RiskGame.createSet(Board.BUILDINGS[5].getRooms()[1], Board.BUILDINGS[2].getRooms()[2]));
        result.put(Board.BUILDINGS[5].getRooms()[1], RiskGame.createSet(Board.BUILDINGS[5].getRooms()[0], Board.BUILDINGS[3].getRooms()[1], Board.BUILDINGS[0].getRooms()[2]));
        
        return Collections.unmodifiableMap(result);
	}

	/**
	 * Creates a set of one room to create the map
	 * @param roomOne	The room to add in the set
	 * @return aSet		The set of one room
	 */
	private static Set<Room> createSet(Room roomOne)
	{
		Set<Room> aSet = new HashSet<Room>();
		
		aSet.add(roomOne);
		
		return aSet;
	}

	/**
	 * Creates a set of two rooms to create the map
	 * @param roomOne	The room to add in the set
	 * @param roomTwo	The room to add in the set
	 * @return aSet		The set of two room
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo)
	{
		Set<Room> aSet = new HashSet<Room>();
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		
		return aSet;
	}

	/**
	 * Creates a set of three rooms to create the map
	 * @param roomOne	The room to add in the set
	 * @param roomTwo	The room to add in the set
	 * @param roomThree	The room to add in the set
	 * @return aSet		The set of three room
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo, Room roomThree)
	{
		Set<Room> aSet = new HashSet<Room>();
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		aSet.add(roomThree);
		
		return aSet;
	}

	/**
	 * Creates a set of four rooms to create the map
	 * @param roomOne	The room to add in the set
	 * @param roomTwo	The room to add in the set
	 * @param roomThree	The room to add in the set
	 * @param roomFour	The room to add in the set
	 * @return aSet		The set of four room
	 */
	private static Set<Room> createSet(Room roomOne, Room roomTwo, Room roomThree, Room roomFour)
	{
		Set<Room> aSet = new HashSet<Room>();
		
		aSet.add(roomOne);
		aSet.add(roomTwo);
		aSet.add(roomThree);
		aSet.add(roomFour);
		
		return aSet;
	}
	
	public static Map<Room, Set<Room>> getDefaultLinks()
	{
		return DEFAULT_LINKS;
	}
}
