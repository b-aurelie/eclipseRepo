package model;

public class Personne {

	private int numP;
	private String nom;
	private String prenom;
	private String age;
	
	public Personne() {super();}

	public Personne(int numP, String nom, String prenom, String age) {
		super();
		this.numP = numP;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne(String nom, String prenom, String age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne(String nom) {
		super();
		this.nom = nom;
	}
	
	public int getNumP() {
		return numP;
	}

	public void setNumP(int numP) {
		this.numP = numP;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [numP=" + numP + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}