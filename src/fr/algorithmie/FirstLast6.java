/**
 * 
 */
package fr.algorithmie;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE First Last 6
 * 
 * @author Jeremy
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tableau d'entiers
		int[] arrayEntiers = { 5, 23, 4, 6 };

		// Booléen d'analyse du tableau
		boolean arrayBoolean;

		// Vérification si tableau non vide, puis si premier élément ou dernier élément vaut 6
		if (arrayEntiers != null && arrayEntiers[0] == 6 || arrayEntiers[arrayEntiers.length - 1] == 6) {
			arrayBoolean = true;
		} else {
			arrayBoolean = false;
		}

		System.out.println(arrayBoolean);
	}

}
