package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 9 COMPARAISONTABLEAU
 * @author Jeremy
 *
 */
public class ComparaisonTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Premier tableau
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		
		// Second tableau
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		/*
		 *  Comparaison des deux tableaux
		 */
		int arrayCompare = 0;
		
		for (int i = 0; i < array1.length ; i++) {
			// Résolution du conflit quand un tableau est plus petit que l'autre
			int value1 = (i < array1.length) ? array1[i] : 0;
			int value2 = (i < array2.length) ? array2[i] : 0;
			
			if (value1 == value2) {
				arrayCompare++;
			}
		}
		System.out.println("Nombre d’éléments en commun : " + arrayCompare);

	}

}
