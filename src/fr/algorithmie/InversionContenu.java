package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 2 INVERSIONCONTENU
 * @author Jeremy
 *
 */
public class InversionContenu {

	/**
	 * main
	 */
	public static void main(String[] args) {
		
		/*
		 * Copie de tableau inversé
		*/
		
		// Tableau array source
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Tableau arrayCopy destination
		int[] arrayCopy = new int[array.length];
		
		
		/* Copie d'array vers arrayCopy avec inversion des données
			i -> valeur d'array	|	j -> index d'arrayCopy
		*/
		for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
				arrayCopy[j] = array[i];
		}
		
		
		/*
		 * Affichage des deux tableaux
		 */
		System.out.println("Résultat du premier tableau :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n");
		
		System.out.println("Résultat du tableau copié :");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
		
	}

}
