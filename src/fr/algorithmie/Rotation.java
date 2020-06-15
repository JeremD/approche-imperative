package fr.algorithmie;

import java.util.Arrays;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Rotation
 * 
 * @author Jeremy
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau d'entiers
		int[] arrayEntiers = { 0, 1, 2, 3 };

		// Variable de sélecteur d'index et de sélection de valeur
		int indexSelect;
		int valueSelect = arrayEntiers[0];

		// variable de décallage du tableau
		int decalageArray = 1;

		// Parcours du tableau selon la valeur de décallage
		for (int i = 0; i < decalageArray; i++) {
			// Interversion de chaque index du tableau avec la suivante
			for (indexSelect = 0; indexSelect < arrayEntiers.length - 1; indexSelect++) {
				arrayEntiers[indexSelect] = arrayEntiers[indexSelect + 1];
			}
			arrayEntiers[indexSelect] = valueSelect;
		}

		System.out.println("Rotation du tableau : " + Arrays.toString(arrayEntiers));
	}

}
