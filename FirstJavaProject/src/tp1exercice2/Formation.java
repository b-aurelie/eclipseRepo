package tp1exercice2;

public class Formation {

	private String intitule;
	private int nbrJours;
	Stagiaire[] stagiaires;
	
	public Formation() {super();}

	public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
		super();
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}
	
	public float calculerMoyenneFormation() {
		float sum=0;
		for (Stagiaire stagiaire : stagiaires) {
			sum+=stagiaire.calculerMoyenne();
		}
		return sum/stagiaires.length;
	}
	
	public String afficherNomMax() {
		String nom="";
		float moyenneMax=0;
		for (Stagiaire stagiaire : stagiaires) {
			if(stagiaire.calculerMoyenne()>=moyenneMax) {
				nom=stagiaire.getNom();
				moyenneMax=stagiaire.calculerMoyenne();
			}
		}
		return nom;
	}
	
	public int afficherMinMax() {
		String nom=this.afficherNomMax();
		for (Stagiaire stagiaire : stagiaires) {
			if (nom.equals(stagiaire.getNom())) {
				return stagiaire.trouverMin();
			}
		}
		return -1;
	}
	
	public float trouverMoyenneParNom(String nom) {
		for (Stagiaire stagiaire : stagiaires) {
			if (nom.equals(stagiaire.getNom())) {
				 return stagiaire.calculerMoyenne();
			}
		}
		return -1;
	}
}
