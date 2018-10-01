package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MyConnection;
import model.Vehicule;

public class VehiculeDaoImpl implements Dao<Vehicule> {

	@Override
	public void save(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("INSERT INTO Vehicule VALUES (?,?,?,?,?);");
					ps.setInt(1, vehicule.getNumImmat());
					ps.setString(2, vehicule.getMarque());
					ps.setString(3, vehicule.getModele());
					ps.setInt(4, vehicule.getAnnee());
					ps.setInt(5, vehicule.getNum());
					ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public void remove(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM Vehicule where numImmat=?;");
				ps.setInt(1, vehicule.getNumImmat());
				ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public void update(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE Vehicule set marque=?,modele=?,annee=?,num=? where numImmat=?;");
				ps.setString(1, vehicule.getMarque());
				ps.setString(2, vehicule.getModele());
				ps.setInt(3, vehicule.getAnnee());
				ps.setInt(4, vehicule.getNum());
				ps.setInt(5, vehicule.getNumImmat());
				ps.executeUpdate();
			}
		catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	@Override
	public Vehicule findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM vehicule WHERE numImmat = ?; ");
				ps.setInt(1, id);
				ResultSet r =ps.executeQuery();
				r.next();
				Vehicule v = new Vehicule(r.getInt("numImmat"),r.getString("marque"),r.getString("modele"),r.getInt("annee"),r.getInt("num"));
				return v;
			} 
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Vehicule> getAll() {
		ArrayList<Vehicule> listeV = new ArrayList<Vehicule>();
		Connection c = MyConnection.getConnection();
		if (c !=null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM vehicule;");
				ResultSet r =ps.executeQuery();
				while (r.next()){listeV.add(new Vehicule(r.getInt("numImmat"),r.getString("marque"),r.getString("modele"),r.getInt("annee"),r.getInt("num")));}
			}
			catch (SQLException e) {e.printStackTrace();}
		}
		return listeV;
	}
}
