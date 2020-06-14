package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE Somme de Tableaux Diff
 * 
 * @author Jeremy
 *
 */
public class SommeDeTableauxDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Premier tableau
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Second tableau
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		/*
		 * Somme des deux tableaux
		 */
		int[] arrayTotal = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			// Gestion du cas quand un tableau plus petit que l'autre
			int value1 = (i < array1.length) ? array1[i] : 0;
			int value2 = (i < array2.length) ? array2[i] : 0;

			// Somme des éléments
			arrayTotal[i] = value1 + value2;
		}

		System.out.println("Somme des deux tableaux :");
		for (int i = 0; i < arrayTotal.length; i++) {
			System.out.println(arrayTotal[i]);
		}

	}

}
