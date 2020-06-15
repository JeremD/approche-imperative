package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Tant Que
 * 
 * @author Jeremy
 *
 */
public class InteractifTantQue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Saisie d'un nombre au clavier
		Scanner scanner = new Scanner(System.in);
		int choixNombre;
		boolean boucleChoix = true;

		// Boucle infinie tant que le nombre n'est pas entre 1 et 10
		while (boucleChoix) {
			System.out.println("Veuillez choisir un nombre entre 1 et 10");
			choixNombre = scanner.nextInt();

			if ((choixNombre > 0 && choixNombre <= 10)) {
				System.out.println("Vous avez choisi " + choixNombre);
				boucleChoix = false;
			}
		}

		scanner.close();
	}

}
