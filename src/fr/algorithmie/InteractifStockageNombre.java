package fr.algorithmie;

import java.util.Arrays;
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

		int choixUser, choixNombre;
		int[] arrayNombres = new int[10];
		int arrayIndex = 0;

		boolean boucleChoix = true;

		// Saisie d'un nombre au clavier
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenu dans le programme !");

		while (boucleChoix) {
			System.out.println("Veuillez choisir une option \r1. Ajouter un nombre	2. Afficher les nombres existants");
			choixUser = scanner.nextInt();
			switch (choixUser) {
			case 1:
				System.out.println("Choix du nombre : ");
				choixNombre = scanner.nextInt();
				arrayNombres[arrayIndex] = choixNombre;
				arrayIndex++;
				break;
			case 2:
				System.out.println("Résultat des nombres choisis : " + Arrays.toString(arrayNombres));
				boucleChoix = false;
				break;
			default:
				break;
			}
		}

	}

}
