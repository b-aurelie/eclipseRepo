package secondJavaTask;

public class Main {

	public static void main(String[] args) {
		
		Adresse adresse = new Adresse("rue Paradis","13006","Marseille");
		Adresse adresse2 = new Adresse("bd du Progrès","13014","Marseille");
		Adresse[] adresses = new Adresse[2];
		adresses[0] = adresse;
		adresses[1] = adresse2;
		
		//en une seule ligne
		//Adresse[] adresses = {new Adresse("rue Paradis","13006","Marseille"),new Adresse("bd du Progrès","13014","Marseille")};
		
		Personne personne = new Personne();
		personne.setNom("Bing");
		personne.setPrenom("Chandler");
		personne.setNum(100);
		personne.setAdresses(adresses);
//		System.out.println(personne);
//		System.out.println(Personne.getNbrPersonnes());
		 
		Personne personne2 = new Personne(200,"Hannigan","Mike",adresses);
//		System.out.println(personne2);
//		System.out.println(Personne.getNbrPersonnes());
		
		Etudiant etudiant1 = new Etudiant(300,"Buffay","Phoebe",adresses,"L1");
		Etudiant etudiant2 = new Etudiant(400,"Green","Rachel",adresses,"M2");
		
		Enseignant enseignant1 = new Enseignant(500,"Tribbiani","Joey",adresses,"Maths");
		Enseignant enseignant2 = new Enseignant(600,"Geller","Ross",adresses,"Anglais");
		
//		System.out.println(etudiant1);
//		System.out.println(enseignant1);

		Personne[] personnes = new Personne[6];
		personnes[0] = personne;
		personnes[1] = personne2;
		personnes[2] = etudiant1;
		personnes[3] = etudiant2;
		personnes[4] = enseignant1;
		personnes[5] = enseignant2;
		 
		for (Personne personneI : personnes) {
			System.out.println(personneI);
		}
		
		Imprimable i = new Etudiant (700,"Geller","Monica",adresses,"L3");
	
	}
	
}
