package tp1exercice1;

public class Main {

	public static void main(String[] args) {
		
		MaDate date = new MaDate(30,12,2018);
		
		System.out.println(date);
		date.ajouterUnJour();
		System.out.println(date);
		date.ajouterPlusieursJours(3);
		System.out.println(date);
		date.ajouterUnMois();
		System.out.println(date);
		date.ajouterUneAnnee();
		System.out.println(date);

		
	}

}
