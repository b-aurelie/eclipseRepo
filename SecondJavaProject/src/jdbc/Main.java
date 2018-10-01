package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.PersonneDaoImpl;
import dao.VehiculeDaoImpl;
import model.Personne;
import model.Vehicule;


public class Main {

	public static void main(String[] args) throws SQLException {
	
//		try {			
//			// creation de la requete (statement)
//			Statement statement = connexion.createStatement();
						
			// insertion de donnees
//			int nbr = statement.executeUpdate("INSERT INTO Personne VALUES (6,'Yang','Cristina','29');");
//				if (0!=nbr) System.out.println("insertion reussie");

//			PreparedStatement ps = connexion.prepareStatement("INSERT INTO Personne VALUES (?,?,?,?);");
//			ps.setInt(1, 7);
//			ps.setString(2, "Karev");
//			ps.setString(3, "Alex");
//			ps.setString(4, "30");
//			int nbr2 =ps.executeUpdate();
//				if (0!=nbr2) System.out.println("insertion reussie");		
			
//			//modification donnees
//			PreparedStatement ps2 = connexion.prepareStatement("UPDATE Personne set nom=?,prenom=?,age=? where numP=?;");
//			ps2.setString(1, "Shepperd");
//			ps2.setString(2, "Derrek");
//			ps2.setString(3, "35");
//			ps2.setInt(4, 6);
//			int nbr3 =ps2.executeUpdate();
//				if (0!=nbr3) System.out.println("modification reussie");
			
//			//suppression donnees
//			PreparedStatement ps3 = connexion.prepareStatement("DELETE FROM Personne where nom=?;");
//			ps3.setString(1, "Wick");
//			int nbr4 =ps3.executeUpdate();
//				if (0!=nbr4) System.out.println("supression reussie");
//				
//			// Execution de la requete
//			ResultSet result = statement.executeQuery("SELECT * FROM Personne;");
//					
//			// Recuperation des donnees
//			while (result.next()) {
//			
//				//on indique chaque fois le nom de la colonne et le type
//				int idPersonne = result.getInt("numP");
//				String nom = result.getString("nom");
//				String prenom = result.getString("prenom");
//			
//				System.out.println(nom + " " + prenom );}
//			}
//		catch (SQLException e) {e.printStackTrace();}
//	
//		finally {
//			if (connexion != null)
//				try {connexion.close();}
//				catch (SQLException ignore) {ignore.printStackTrace();}
//		}
		
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne p = new Personne (9,"Stevens","Izzie","31");
		//daop.save(p);
		//daop.remove(p);
		//daop.update(p);
		Personne pRes = daop.findById(8);
		System.out.println(pRes);
		ArrayList<Personne> listRes = daop.getAll();
		System.out.println(listRes);
		
		VehiculeDaoImpl daov = new VehiculeDaoImpl();
		Vehicule vRes = daov.findById(3);
		System.out.println(vRes);
		ArrayList<Vehicule> listeV = daov.getAll();
		System.out.println(listeV);
		
		
	}
}
