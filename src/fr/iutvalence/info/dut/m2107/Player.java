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
	private final String nom;
	
	/**
	 * This represents the player's faction
	 */
	private final FactionType faction;
	
	/**
	 * this represents a player ready to play
	 */
	public Player(String nom, FactionType faction)
	{
		this.nom = nom;
		this.faction = faction;
	}

	public String getNom()
	{
		return nom;
	}

	public FactionType getFaction()
	{
		return faction;
	}
}