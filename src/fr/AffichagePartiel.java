/**
 * 
 */
package fr;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 3 AFFICHAGEPARTIEL
 * @author Jeremy
 *
 */
public class AffichagePartiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Tableau array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Affichage des éléments > 3
		System.out.println("Valeurs supérieurs à 3 :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		System.out.println("\n");
		
		
		// Affichage des éléments pairs
		System.out.println("Valeurs pairs :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) { //on trouve l'élement pair avec le modulo
				System.out.println(array[i]);
			}
		}
		System.out.println("\n");
		
		// Affichage des index pairs
		System.out.println("Valeurs avec index pairs :");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		System.out.println("\n");
		
		// Affichage des éléments impairs
		System.out.println("Valeurs impairs :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		System.out.println("\n");
		
	}

}
