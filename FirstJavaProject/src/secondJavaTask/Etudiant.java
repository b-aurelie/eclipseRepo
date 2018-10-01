package secondJavaTask;

public class Etudiant extends Personne implements Imprimable {

	private String niveau;
	
	public Etudiant() {super();}

	public Etudiant(int num, String nom, String prenom, Adresse[] adresses, String niveau) {
		super(num, nom, prenom, adresses);
		this.setNiveau(niveau);
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant"+super.toString()+" niveau=" + niveau + "]";
	}

	@Override
	public void afficherNomComplet() {
		System.out.println(super.getNom() +" "+ super.getPrenom());
	}

	
	
	
}
