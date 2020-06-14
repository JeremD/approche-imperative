package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE Recherche Max
 * 
 * @author Jeremy
 *
 */
public class RechercheMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau array
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Initialisation valeur max
		int valueMax = array[0];

		// Recherche du plus grand élément du tableau
		for (int i = 0; i < array.length; i++) {
			if (array[i] > valueMax) {
				valueMax = array[i];
			}
		}

		System.out.println("Valeur la plus grande : " + valueMax);

	}

}
