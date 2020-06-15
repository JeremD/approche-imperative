package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Somme Arithmetique
 * 
 * @author Jeremy
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Saisie d'un nombre au clavier */
		Scanner scanner = new Scanner(System.in);
		int choixNombre;
		int sommeNombres = 0;

		/* Somme entre 1 et le nombre choisi */
		System.out.println("Veuillez choisir un nombre");
		choixNombre = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			sommeNombres = choixNombre + i;
		}

		System.out.println(sommeNombres);
		scanner.close();

	}

}