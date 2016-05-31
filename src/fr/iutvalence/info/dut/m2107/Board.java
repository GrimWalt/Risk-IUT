package fr.iutvalence.info.dut.m2107;

/**
 * This represents the board 
 */
public class Board
{	 
	/**
	 * This represents all the buildings which are on the board
	 */
	// @formatter:off
	public final static Building[] BUILDINGS = 
			new Building[] 
			{
				// 0 - Bâtiment A
				new Building
				(
						new Room[]
						{
								// 0
								new Room("AIV", "A"),
								// 1
								new Room("Passerelle", "A"),
								// 2
								new Room("Salle Filaire", "A"),
								// 3
								new Room("Hall", "A"),
								// 4
								new Room("Direction", "A"),
								// 5
								new Room("Salle TP", "A"),
								// 6
								new Room("Amphi A001", "A"),
								// 7
								new Room("Bibliothèque", "A"),
								// 8
								new Room("Administration", "A"),
								// 9
								new Room("Labo de Langues", "A")
						}
						, "A"
						, 5
				),
				// 1 - Bâtiment B
				new Building
				(
						new Room[]
						{
								// 0
								new Room("B 206", "B"),
								// 1
								new Room("ZOO", "B"),
								// 2
								new Room("WC", "B"),
								// 3
								new Room("CRI", "B"),
								// 4
								new Room("Amphi B018", "B"),
								// 5
								new Room("Hall Technique", "B"),
								// 6
								new Room("Amphi B001", "B")
						}
						, "B"
						, 4
				),
				// 2 - Bâtiment C
				new Building
				(
						new Room[]
						{
								// 0
								new Room("Maintenance Elec", "C"),
								// 1
								new Room("INE", "C"),
								// 2
								new Room("Salle Elec", "C"),
								// 3
								new Room("Amphi C001", "C"),
								// 4
								new Room("Administration", "C")
						}
						, "C"
						, 3
				),
				// 3 - Bâtiment D
				new Building
				(
						new Room[] 
						{
								// 0
								new Room("Plateforme Technologique", "D"),
								// 1
								new Room("Administration IAE", "D"),
								// 2
								new Room("Salle TP", "D"),
								// 3
								new Room("Salle Réseaux", "D")
						}
						, "D"
						, 2
				),
				// 4 - Bâtiment E
				new Building
				(
						new Room[]
						{
								// 0
								new Room("Salle de Projet", "E"),
								// 1
								new Room("Espace Detente", "E"),
								// 2
								new Room("Relations Internationales", "E"),
								// 3
								new Room("Salles d'escalade", "E")
						}
						, "E"
						, 2
				),
				// 5 - Bâtiment CV (Centre de Vie)
				new Building
				(
						new Room[]
						{
								// 0
								new Room("Micro-ondes", "CV"),
								// 1
								new Room("Machines à café", "CV")
						}
						, "CV"
						, 1
				)
			};
	
	// @formatter:on

	/**
	 * This represents a board ready to be used
	 */
	public Board()
	{
		
	}
}
