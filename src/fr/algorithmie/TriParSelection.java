package fr.algorithmie;

/**
 * @author Jeremy
 *
 */
public class TriParSelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Tableau source
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		// Tableau tri par s�lection
		int[] trieSelection = new int[array2.length];
		
		/*
		 * Parcours du tableau
		 * @valeur1 -> index de premi�re valeur
		 * @valeur2 -> index de la valeur suivante
		 */
		for (int valeur1 = 0; valeur1 < array2.length; valeur1++) {
			
			// Index de s�lection
			int indexSelect = valeur1;
			
			for (int valeur2 = valeur1 + 1; valeur2 < array2.length; valeur2++) {
				// Comparaison des deux valeurs puis s�lection de la plus petite
				if (array2[valeur2] < array2[indexSelect]) {
					indexSelect = valeur2;
				}
			}
			
			/*
			 *  Tri du tableau
			 */
			int valueSelect = array2[indexSelect]; // valeur compar�e pr�c�demment
			array2[indexSelect] = array2[valeur1]; // valeur dans l'index
			trieSelection[valeur1] = valueSelect; // �criture dans le tableau de s�lection
		}
		
		System.out.println("Trie par s�lection : ");
		for (int i = 0; i < trieSelection.length; i++) {
			System.out.println(trieSelection[i]);
		}
		
	}

}
