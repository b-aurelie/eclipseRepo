package tp1exercice4;

public class Main {

	public static void main(String[] args) {
		
		Adresse adresse1 = new Adresse("paradis","marseille","13006");
		Adresse adresse2 = new Adresse("rome","marseille","13001");
		Adresse adresse3 = new Adresse("mignet","aix","13100");
		Adresse adresse4 = new Adresse("georges","paris","75006");
		Adresse adresse5 = new Adresse("liberte","aix","13100");
		
		Adresse[] adresses1 = new Adresse[] {adresse1,adresse3};
		Adresse[] adresses2 = new Adresse[] {adresse2,adresse4};
		Adresse[] adresses3 = new Adresse[] {adresse5};
		
		Personne p1 = new Personne("mike",'M',adresses1);
		Personne p2 = new Personne("john",'M',adresses2);
		Personne p3 = new Personne("laura",'F',adresses3);
		
		Personne[] listeP = new Personne[] {p1,p2,p3};
		
		ListePersonnes lp = new ListePersonnes(listeP);
		
		System.out.println(lp.findByNom("mike"));
		System.out.println(lp.findByCodePostal("13100"));
		System.out.println(lp.countPersonneVille("marseille"));
		lp.editPersonneNom("john", "johnny");
		System.out.println(p2);
		lp.editPersonneVille("mike", "lyon");
		System.out.println(lp);
	
	}

}
