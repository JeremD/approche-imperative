package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 7 SOMMEDETABLEAUX
 * @author Jeremy
 *
 */
public class SommeDeTableaux {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Premier tableau
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Second tableau
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		// Somme des deux tableaux
		int[] arrayTotal = new int[array1.length];
		for (int i = 0; i < array1.length ; i++) {
			arrayTotal[i] = array1[i] + array2[i];
		}
			
		System.out.println("Somme des deux tableaux :");
		for (int i = 0; i < arrayTotal.length; i++) {
			System.out.println(arrayTotal[i]);
		}
		
	}
	
}
