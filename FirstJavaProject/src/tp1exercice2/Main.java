package tp1exercice2;

public class Main {

	public static void main(String[] args) {
		
		int[] notes1 = new int[] {8,10,12};
		Stagiaire s1 = new Stagiaire("mike",notes1);
		int[] notes2 = new int[] {14,10,12};
		Stagiaire s2 = new Stagiaire("john",notes2);
		int[] notes3 = new int[] {18,8,14};
		Stagiaire s3 = new Stagiaire("laura",notes3);
		
		Stagiaire [] stagiaires1 = new Stagiaire[] {s1,s2,s3};
		Formation formation1 = new Formation("web", 45, stagiaires1);
		
		System.out.println(s1.calculerMoyenne());
		System.out.println(s2.trouverMax());
		System.out.println(s3.trouverMin());

		System.out.println(formation1.calculerMoyenneFormation());
		System.out.println(formation1.afficherNomMax());
		System.out.println(formation1.afficherMinMax());
		System.out.println(formation1.trouverMoyenneParNom("mike"));	
	}

}
