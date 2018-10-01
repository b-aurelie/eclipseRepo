package secondJavaTask;

import java.util.Arrays;

public class Personne {
	
	// attributs de la classe Personne
	private int num;
	private String nom;
	private String prenom;
	private Adresse [] adresses = new Adresse[2];
	// attribut partagé entre tous les objets de la classe
	private static int nbrPersonnes = 0;
	
	//clic droit sur la classe > source > Generate Constructor using fields (sans attributs)
	public Personne() {
		super();
		nbrPersonnes++;
	}
	
	//clic droit sur la classe > source > Generate Constructor using fields (avec attibuts)
	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
		nbrPersonnes++;
	}

	//clic droit sur la classe > source > Generate Getters and Setters

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	//methode de la classe et pas de l'objet
	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}

	//clic droit sur la classe > source > Generate toString
	//@Override=annotation : redéfinition d'une méthode qui existe déjà dans le main
	@Override
	public String toString() {
		return "[num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}
	
	
	
	
	
}
