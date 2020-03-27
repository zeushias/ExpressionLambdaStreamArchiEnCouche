/**
 * 
 */
package metier;

import java.util.Date;

/**
 * @author KODZO
 * @author YOEKO
 * @author LOIK
 *
 */
public class Etudiant extends Personne{

	// attributs

	private String dateNaissanceEtudiant;
	
	// constructeur

	public Etudiant(int idPersonne, String nom, String prenom, String email, String adresse, String telephone,
			String dateNaissanceEtudiant) {
		super(idPersonne, nom, prenom, email, adresse, telephone);
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}

	public Etudiant(String nom, String prenom, String email, String adresse, String telephone,
			String dateNaissanceEtudiant) {
		super(nom, prenom, email, adresse, telephone);
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	
	// getters et setters

	public String getDateNaissanceEtudiant() {
		return dateNaissanceEtudiant;
	}

	public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}

	// tostring

	@Override
	public String toString() {
		return "[dateNaissance=" + dateNaissanceEtudiant + ", Identifiant=" + getIdPersonne()
				+ ", Nom=" + getNom() + ", Prenom()=" + getPrenom() + ", Email()=" + getEmail()
				+ ", Adresse()=" + getAdresse() + ", Telephone()=" + getTelephone() + "]";
	}
}
