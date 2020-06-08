package fr.algorithmie;

/**
 * Exercices en auto-formation
 * 
 * EXERCICE 1 AFFICHAGEINVERSE
 * @author Jeremy
 *
 */
public class AffichageInverse {

	/**
	 * main
	 */
	public static void main(String[] args) {
		
		// Initialisation du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		
		/*
		 * Affichage du tableau
		*/
		System.out.println("Résultat du tableau :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n");
		
		
		/*
		 * Affichage inversé du tableau
		*/
		System.out.println("Résultat inversé du tableau :");
		
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		System.out.println("\n");
		
		
		/*
		 * Copie du tableau
		*/
		// Initialisation du tableau destinataire
		int[] arrayCopy = new int[array.length];
		
		// Copie du tableau array vers arrayCopy
		System.out.println("Résultat du tableau copié :");
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
			System.out.println(arrayCopy[i]);
		}

	}

}
