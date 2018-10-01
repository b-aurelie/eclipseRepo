package tp1exercice4;

import java.util.Arrays;

public class ListePersonnes {

	Personne[] personnes = new Personne[10];

	public ListePersonnes() {super();}

	public ListePersonnes(Personne[] personnes) {
		super();
		this.personnes = personnes;
	}

	public Personne[] getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}
	
	@Override
	public String toString() {
		return "ListePersonnes [personnes=" + Arrays.toString(personnes) + "]";
	}

	public Personne findByNom(String s) {
		for (Personne personne : personnes) {
			if (personne.getNom().equals(s)) return personne;
		}
		return null;
	}
	
	public boolean findByCodePostal(String cp) {
		for (Personne personne : personnes) {
			for (Adresse adresse : personne.getAdresses()) {
				if(adresse.getCodePostal().equals(cp)) return true;
			}
		}
		return false;
	}
	
//	public int countPersonneVille(String ville) {
//		int count=0;
//		for (Personne personne : personnes) {
//			for (Adresse adresse : personne.getAdresses()) {
//				if(adresse.getVille().equals(ville)) count++;
//			}
//		}
//		return count;
//	}
	
	//si plusieurs adresses dans la meme ville
	public int countPersonneVille(String ville) {
	int count=0;
	for (Personne personne : personnes) {
		boolean test=false;
		for (int i=0; i<personne.getAdresses().length && !test;i++) {
			if(personne.getAdresses()[i].getVille().equals(ville)) {
				count++;
				test=true;
			}
		}
	}
	return count;
}
	
	public void editPersonneNom(String oldNom, String newNom) {
		for (Personne personne : personnes) {
			if (personne.getNom().equals(oldNom)) personne.setNom(newNom);
		}
	}
	
	public void editPersonneVille(String nom,String newVille) {
		for (Personne personne : personnes) {
			for (Adresse adresse : personne.getAdresses()) {
				if(personne.getNom().equals(nom)) adresse.setVille(newVille);;
			}
		}
	}
}