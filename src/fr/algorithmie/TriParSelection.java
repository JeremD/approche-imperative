package fr.algorithmie;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Tri par Sélection
 * 
 * @author Jeremy
 *
 */
public class TriParSelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau source
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		// Tableau tri par sélection de même taille que la source
		int[] trieSelection = new int[array2.length];

		/*
		 * Parcours du tableau
		 * 
		 * indexActuel -> index première valeur
		 * 
		 * indexSuivant -> index valeur suivante
		 */
		for (int indexActuel = 0; indexActuel < array2.length; indexActuel++) {

			// Index du tableau actuel dans indexSelect pour comparaison
			int indexSelect = indexActuel;

			// Recherche du plus petit élément et stockage dans indexSelect
			for (int indexSuivant = indexActuel + 1; indexSuivant < array2.length; indexSuivant++) {

				if (array2[indexSuivant] < array2[indexSelect]) {
					indexSelect = indexSuivant;
				}
			}

			/*
			 * Tri du tableau
			 */
			// Elément le plus petit trouvé
			int valueSelect = array2[indexSelect];

			// Echange élément actuel du premier tableau avec élément plus petit
			array2[indexSelect] = array2[indexActuel];

			// Stockage élément plus petit dans second tableau
			trieSelection[indexActuel] = valueSelect;
		}

		// Affichage tableau de sélection
		System.out.println("Trie par sélection : ");
		for (int i = 0; i < trieSelection.length; i++) {
			System.out.println(trieSelection[i]);
		}

	}

}
