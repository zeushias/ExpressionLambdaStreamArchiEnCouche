/**
 * Class main pour lancer notre application de gestion d'école
 * 
 */
package presentation;

import java.util.List;
import java.util.Scanner;
import dao.Dao;
import metier.Etudiant;

/**
 * Class main pour lancer notre application de gestion de l'école
 * 
 * @author KODZO
 * @author YOEKO
 * @author LOIK
 *
 */
public class Lanceur {
	static Dao dao = new Dao();
	static String statut = "";
	private static Scanner scan;

	public static void main(String[] args) {

		
		// utilisateur
		System.out.println("--------------------------------------------------------------");
		System.out.println("Pour lister les étudiants tapez 1");
		System.out.println("Pour le nombre d'étudiants tapez 2");
		System.out.println("--------------------------------------------------------------");
		
		scan = new Scanner(System.in);
		//
		System.out.print("Saisir un chiffre : ");
		int chiffre = scan.nextInt();
				
		switch (chiffre) {
		case 1:
			
			// lister les étudiants
			System.out.println();
			System.out.println("La liste des étudiants");
			List<Etudiant> list = Dao.lireEtudiant();
			//stream
			list.stream().forEach(System.out::println);
			//affichage();
			break;
		case 2:
			// lister les étudiants
			System.out.println();
			System.out.println("Nombre de personne");
			Dao.lireEtudiant();
			//affichage();
			break;
		default:
			break;
		}
	}

	

}
