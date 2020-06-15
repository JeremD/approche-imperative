package fr.algorithmie;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE First Last
 * 
 * @author Jeremy
 *
 */
public class FirstLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau d'entiers
		int[] arrayEntiers = { 5, 23, 4, 5, 95 };

		// Booléen d'analyse du tableau
		boolean arrayBoolean;

		// Vérification si tableau initialisé , puis si premier et dernier élément sont égaux
		if (arrayEntiers.length >= 1 && arrayEntiers[0] == arrayEntiers[arrayEntiers.length - 1]) {
			arrayBoolean = true;
		} else {
			arrayBoolean = false;
		}

		System.out.println(arrayBoolean);
	}

}
