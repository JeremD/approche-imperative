package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE Calcul Moyenne
 * 
 * @author Jeremy
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau array
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Addition total des éléments
		int valueTotal = 0;
		for (int i = 0; i < array.length; i++) {
			valueTotal = valueTotal + array[i];
		}

		// Calcul moyenne
		int valueMoyenne = valueTotal / array.length;

		System.out.println("Moyenne du tableau : " + valueMoyenne);

	}

}