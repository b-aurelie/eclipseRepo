package model;

public class Vehicule {

	private int numImmat;
	private String marque;
	private String modele;
	private int annee;
	private int num;
	
	public Vehicule() {
		super();
	}

	public Vehicule(int numImmat, String marque, String modele, int annee, int num) {
		super();
		this.numImmat = numImmat;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.num = num;
	}

	public int getNumImmat() {
		return numImmat;
	}

	public void setNumImmat(int numImmat) {
		this.numImmat = numImmat;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Vehicule [numImmat=" + numImmat + ", marque=" + marque + ", modele=" + modele + ", annee=" + annee
				+ ", num=" + num + "]";
	}
}
