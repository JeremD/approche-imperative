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
		 * indexSource -> index première valeur
		 * 
		 * indexTrie -> index valeur suivante
		 */
		for (int indexSource = 0; indexSource < array2.length; indexSource++) {

			// Index de sélection
			int indexSelect = indexSource;

			for (int indexTrie = indexSource + 1; indexTrie < array2.length; indexTrie++) {
				// Comparaison des deux valeurs puis sélection de la plus petite dans index sélection
				if (array2[indexTrie] < array2[indexSelect]) {
					indexSelect = indexTrie;
				}
			}

			/*
			 * Tri du tableau
			 */
			// Valeur comparée précédemment
			int valueSelect = array2[indexSelect];

			// Insertion valeur dans l'index sélection
			array2[indexSelect] = array2[indexSource];

			// Ecriture valeur sélection dans tableau sélection
			trieSelection[indexSource] = valueSelect;
		}

		// Affichage tableau de sélection
		System.out.println("Trie par sélection : ");
		for (int i = 0; i < trieSelection.length; i++) {
			System.out.println(trieSelection[i]);
		}

	}

}
