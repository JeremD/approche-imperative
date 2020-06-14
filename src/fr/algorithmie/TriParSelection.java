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

		// Tableau tri par sélection
		int[] trieSelection = new int[array2.length];

		/*
		 * Parcours du tableau
		 * 
		 * valeurSource -> index première valeur
		 * 
		 * valeurTrie -> index valeur suivante
		 */
		for (int valeurSource = 0; valeurSource < array2.length; valeurSource++) {

			// Index de sélection
			int indexSelect = valeurSource;

			for (int valeurTrie = valeurSource + 1; valeurTrie < array2.length; valeurTrie++) {
				// Comparaison des deux valeurs puis sélection de la plus petite dans index
				// sélection
				if (array2[valeurTrie] < array2[indexSelect]) {
					indexSelect = valeurTrie;
				}
			}

			/*
			 * Tri du tableau
			 */
			// Valeur comparée précédemment
			int valueSelect = array2[indexSelect];

			// Insertion valeur dans l'index sélection
			array2[indexSelect] = array2[valeurSource];

			// Ecriture valeur sélection dans tableau sélection
			trieSelection[valeurSource] = valueSelect;
		}

		// Affichage tableau de sélection
		System.out.println("Trie par sélection : ");
		for (int i = 0; i < trieSelection.length; i++) {
			System.out.println(trieSelection[i]);
		}

	}

}
