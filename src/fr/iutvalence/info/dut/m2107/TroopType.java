package fr.iutvalence.info.dut.m2107;

/**
 * This represents the different troops
 * 
 * @author Nico
 */
public enum TroopType
{
	/**
	 * This represents the ELEVE typed troops
	 */
	ELEVE(1),
	
	/**
	 * This represents the PROF typed troops
	 * A PROF is equivalent to five ELEVEs
	 */
	PROF(5);
	
	/**
	 * This represent the value of a troop
	 */
	private final int valeur;
	
	private TroopType(int valeur)
	{
		this.valeur = valeur;
	}
}