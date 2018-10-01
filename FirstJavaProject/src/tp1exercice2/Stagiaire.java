package tp1exercice2;

public class Stagiaire {

	private String nom;
	private int[] notes = {0,0,0};
	
	public Stagiaire() {super();}

	public Stagiaire(String nom, int[] notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}
		
	public float calculerMoyenne() {
		float sum=0;
		for (float i : notes) {
			sum+=i;
		}
		return sum/notes.length;
	}
	
	public int trouverMax() {
		int max=0;
		for (int i : notes) {
			if (i>max) max=i;
		}
		return max;
	}
	
	public int trouverMin() {
		int min=20;
		for (int i : notes) {
			if (i<min) min=i;
		}
		return min;
	}
}
