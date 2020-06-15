package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Interactif Stockage Nombre
 * 
 * @author Jeremy
 *
 */
public class InteractifStockageNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Saisie d'un nombre au clavier, et stockage dans un tableau dynamic
		int choixUser, choixNombre;
		boolean boucleChoix = true;
		ArrayList<Integer> arrayNombres = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenu dans le programme !");

		// Boucle infinie
		while (boucleChoix) {
			System.out.println("Veuillez choisir une option \r1. Ajouter un nombre	2. Afficher les nombres existants");
			choixUser = scanner.nextInt();
			switch (choixUser) {
			case 1:
				System.out.println("Choix du nombre : ");
				choixNombre = scanner.nextInt();
				arrayNombres.add(choixNombre);
				break;
			case 2:
				System.out.println("Résultat des nombres choisis : " + (arrayNombres));
				boucleChoix = false;
				break;
			default:
				break;
			}
		}
		scanner.close();

	}

}
