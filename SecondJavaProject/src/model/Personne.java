package model;

/**
 * @author Administrateur
 *
 */
public class Personne {

	private int numP;
	private String nom;
	private String prenom;
	private String age;
	
	/**
	 * 
	 */
	public Personne() {super();}

	/**
	 * @param numP id de la personne
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param age age de la personne
	 */
	public Personne(int numP, String nom, String prenom, String age) {
		super();
		this.numP = numP;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	
	/**
	 * @return l'identifiant de la personne
	 */
	public int getNumP() {
		return numP;
	}

	/**
	 * @param numP identifiant de la personne
	 */
	public void setNumP(int numP) {
		this.numP = numP;
	}

	/**
	 * @return le nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return l'age de la personne
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age age de la personne
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [numP=" + numP + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
