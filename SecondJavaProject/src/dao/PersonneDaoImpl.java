package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MyConnection;
import model.Personne;

public class PersonneDaoImpl implements Dao<Personne> {

	@Override
	public void save(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("INSERT INTO Personne VALUES (?,?,?,?);");
					ps.setInt(1, personne.getNumP());
					ps.setString(2, personne.getNom());
					ps.setString(3, personne.getPrenom());
					ps.setString(4, personne.getAge());
					ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public void remove(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM Personne where nom=?;");
				ps.setString(1, personne.getNom());
				ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public void update(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE Personne set nom=?,prenom=?,age=? where numP=?;");
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.setString(3, personne.getAge());
				ps.setInt(4, personne.getNumP());
				ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public Personne findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM personne WHERE numP = ?; ");
				ps.setInt(1, id);
				ResultSet r =ps.executeQuery();
				r.next();
				Personne p = new Personne(r.getInt("numP"),r.getString("nom"),r.getString("prenom"),r.getString("age"));
				return p;
			} 
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Personne> getAll() {
		ArrayList<Personne> listeP = new ArrayList<Personne>();
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM personne;");
				ResultSet r =ps.executeQuery();
				while (r.next()){listeP.add(new Personne(r.getInt("numP"),r.getString("nom"),r.getString("prenom"),r.getString("age")));}
			}
			catch (SQLException e) {e.printStackTrace();}
		}
		return listeP;
	}
}
