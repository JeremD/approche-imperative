package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Plus Moins
 * 
 * @author Jeremy
 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Nombre aléatoire entre 1 et 100
		int randomNumber = (int) (Math.random() * 100 + 1);

		int choixNombre;
		boolean boucleChoix = true;
		int nombresTentatives = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Devinez le nombre entre 1 et 100");
		choixNombre = scanner.nextInt();

		// Boucle infinie tant que l'utilisateur n'a pas deviné le nombre
		while (boucleChoix) {
			if (choixNombre > randomNumber) {
				System.out.println("Vous êtes au-dessus du nombre");
				nombresTentatives++;
				choixNombre = scanner.nextInt();
			} else if (choixNombre < randomNumber) {
				System.out.println("Vous êtes en-dessous du nombre");
				nombresTentatives++;
				choixNombre = scanner.nextInt();
			} else {
				System.out.println("Bravo, vous avez trouvé en " + nombresTentatives + " coups");
				boucleChoix = false;
			}
		}

	}

}
