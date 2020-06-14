package fr.algorithmie;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Tri à Bulles
 * 
 * @author Jeremy
 *
 */
public class TriABulles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau à trtier
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		// Sélecteur d'élément du tableau
		int indexSelect = 0;

		/*
		 * Parcours du tableau à trier
		 * 
		 * indexActuel -> index première valeur
		 * 
		 * indexSuivant -> index valeur suivante
		 */
		for (int indexActuel = 0; indexActuel < array2.length; indexActuel++) {

			// Tri du tableau à la volée
			for (int indexSuivant = 1; indexSuivant < array2.length - indexActuel; indexSuivant++) {

				// Echange des index si l'élément actuel et plus grand que le suivant
				if (array2[indexSuivant - 1] > array2[indexSuivant]) {

					indexSelect = array2[indexSuivant - 1];
					array2[indexSuivant - 1] = array2[indexSuivant];
					array2[indexSuivant] = indexSelect;
				}
			}

		}

		// Affichage tableau trié
		System.out.println("Trie à bulles : ");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
