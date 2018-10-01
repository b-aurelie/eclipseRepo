package secondJavaTask;

public class Enseignant extends Personne implements Imprimable {

	private String matiere;
	
	public Enseignant() {
		super();
	}

	public Enseignant(int num, String nom, String prenom, Adresse[] adresses, String matiere) {
		super(num, nom, prenom, adresses);
		this.setMatiere(matiere);
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Enseignant"+super.toString()+" matiere=" + matiere + "]";
	}

	@Override
	public void afficherNomComplet() {
		System.out.println(super.getNom() +" "+ super.getPrenom());
	}

	
}

