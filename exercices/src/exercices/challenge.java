package exercices;

public class challenge {
	
	public static void afficher(int tableau[]) {
		System.out.println(""+tableau[0]+"."+tableau[1]+"."+tableau[2]+"."+tableau[3]);
	}

	public static void main(String[] args) {
		
		int tab[] = {0,0,0,0};
			
		for (int i = tab.length-1;i>1;i--) {
			while (tab[i]<9) {
				tab[i]++;
				afficher(tab);
				if (tab[i]==9) {
						tab[i]=0;
						i--;
				}
			}
		}
	}
}