package fr.iutvalence.info.dut.m2107;

/**
 * this represents the player.
 * 
 * @author Nico
 */
public class Joueur
{
	/**
	 * this represents the player's name
	 */
	private final String nom;
	
	/**
	 * This represents the player's faction
	 */
	private final TypeFaction faction;
	
	/**
	 * this represents a player ready to play
	 */
	public Joueur(String nom, TypeFaction faction)
	{
		this.nom = nom;
		this.faction = faction;
	}
}