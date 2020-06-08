package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 5 RECHERCHEMIN
 * @author Jeremy
 *
 */
public class RechercheMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Tableau array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Initialisation valeur min
		int valueMin = array[0];
		
		// Recherche du plus petit élément du tableau
		for (int i = 0; i < array.length; i++) {
			if (array[i] < valueMin) {
				valueMin = array[i];
			}
		}
		
		System.out.println("Valeur la plus petite : " + valueMin);
	
	}

}