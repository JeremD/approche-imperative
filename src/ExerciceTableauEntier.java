
public class ExerciceTableauEntier {
/**
 * PARCOURS D’UN TABLEAU D’ENTIERS
 * 
 */
	
	public static void main(String[] args) {
	
	int[] valeurTableaux = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	System.out.println("Premier élément : " + valeurTableaux[0]);
	System.out.println("Longueur du tableau : " + valeurTableaux.length);
	System.out.println("Dernier élément du tableau : " + valeurTableaux[valeurTableaux.length - 1]);
	
	System.out.println("Valeur de l'index 4 : " + valeurTableaux[4]);
	valeurTableaux[4] = 8;
	
	System.out.println("Nouvelle valeur de l'index 4 : " + valeurTableaux[4]);
	
	}

}
