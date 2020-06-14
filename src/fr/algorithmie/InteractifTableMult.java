package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Table Mult
 * 
 * @author Jeremy
 *
 */
public class InteractifTableMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Saisie d'un nombre au clavier */
		Scanner scanner = new Scanner(System.in);
		int choixNombres;

		/* Table de multiplication du nombre choisi */
		System.out.println("Veuillez choisir un nombre entre 1 et 10");
		choixNombres = scanner.nextInt();

		if ((choixNombres > 0 && choixNombres <= 10)) {
			System.out.println("Table de : " + choixNombres);
			for (int i = 1; i <= 10; i++) {
				int multiplication = choixNombres * i;
				System.out.println(choixNombres + " * " + i + " = " + multiplication);
			}
		}
		else {
			System.out.println("Saisie incorrect, veuillez réessayer !");
		}

		scanner.close();
	}

}
