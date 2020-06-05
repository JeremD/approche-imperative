package fr.boucles;

public class ExerciceBoucleBase {
/**
 * main
 * @param args
 */
	public static void main(String[] args) {
		
	//Affichage de tous les nombres
	int[] numberSimple = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	for (int i = 0; i < numberSimple.length;  i++) {
		//System.out.println(numberSimple[i]);
	}
	
	//---------//
	//line break
	//System.out.println("\n");
	//---------//
	
	
	//Affichage du prénom
	String monNom = "Jérémy D.";
	
	for (int i = 0; i <= 20; i++) {
		//System.out.println(monNom);
	} 
	
	//---------//
	//line break
	//System.out.println("\n");
	//---------//
	
	
	//Affichage des nombres pairs
	int nbPaire = 2;
	
	for (int i = 0; i <= 100 ; i+=2) {
		System.out.println(nbPaire + i);
	}
	
	}
	
}
