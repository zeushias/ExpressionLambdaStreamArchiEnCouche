/**
 * Interface IEtudiant
 */
package service;

import java.util.List;

import metier.Etudiant;

/**
 * @author KODZO
 * @author YOEKO
 * @author LOIK
 *
 */
public interface IEtudiant {

	void creerEtudiant(Etudiant etudiant);
	void supprimerEtudiant(Etudiant etudiant);
	void modifierEtudiant(Etudiant etudiant);
	List<Etudiant> listerEtudiant();
	void lireUnEtudiant(Integer numero);
}
