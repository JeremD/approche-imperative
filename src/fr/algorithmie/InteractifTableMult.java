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
		int choixNombre;

		/* Table de multiplication du nombre choisi */
		System.out.println("Veuillez choisir un nombre entre 1 et 10");
		choixNombre = scanner.nextInt();

		if ((choixNombre > 0 && choixNombre <= 10)) {
			System.out.println("Table de : " + choixNombre);
			for (int i = 1; i <= 10; i++) {
				int multiplication = choixNombre * i;
				System.out.println(choixNombre + " * " + i + " = " + multiplication);
			}
		}
		else {
			System.out.println("Saisie incorrect, veuillez réessayer !");
		}

		scanner.close();
	}

}
