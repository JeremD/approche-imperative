package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Plus Grand
 * 
 * @author Jeremy
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Variable stockant valeur la plus grande
		int plusgrandNombre = 0;

		/*
		 * Choix des 10 nombres
		 */
		int choixNombre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez choisir 10 nombres :");

		// Saisie de chaque nombre
		for (int i = 0; i < 10; i++) {
			choixNombre = scanner.nextInt();

			if (choixNombre > plusgrandNombre) {
				plusgrandNombre = choixNombre;
			}
		}
		System.out.println("Le plus grand nombres : " + plusgrandNombre);
	}

}
