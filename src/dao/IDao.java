package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import metier.Etudiant;

public interface IDao {
	
	
	public static int nombreEtudiant() {
		
		String url = "jdbc:mysql://localhost/ges_ecole_ensup";
		String login = "root";

		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		String password ="root";
		List<Etudiant> list = new ArrayList<Etudiant>();
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "select * from personne";

			// etape 4 executer la requette
			System.out.println("Liste des etudiants ");
			rs = st.executeQuery(sql);

			// etape5 parcours du resultSet
			
			while (rs.next()) {
				Etudiant etudiant = new Etudiant(rs.getInt("idPersonne"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("adresse"),
						rs.getString("telephone"),
						rs.getString("date_naissance"));
				list.add(etudiant);
			}
			

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {

			// etape 5 liberer les ressources
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return list.size();
	}
}
