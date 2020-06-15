package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Chiffres Suivants
 * 
 * @author Jeremy
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Saisie d'un nombre au clavier */
		Scanner scanner = new Scanner(System.in);
		int choixNombre;

		/* Affichage des 10 nombres suivants */ 
		System.out.println("Veuillez choisir un nombre");
		choixNombre = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(choixNombre + i + ", ");
		}
		scanner.close();

	}

}
