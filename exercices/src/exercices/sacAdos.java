package exercices;
import java.util.Random;

public class sacAdos {
	
	public static void triTableau(int tab[][]) {
	
		int temp[] = {0,0};

		for(int i=tab.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(tab[j+1][0]/tab[j+1][1]>tab[j][0]/tab[j][1]) {
					for (int z=0;z<=1;z++) {
						temp[z] = tab[j+1][z];
						tab[j+1][z] = tab[j][z];
						tab[j][z] = temp[z];
					}
				}
			}
		}
	}
	
	public static void affichageTableau(int tab[][]) {
		for (int i=0;i<tab.length;i++) {
			System.out.print(tab[i][0]+"|"+tab[i][1]+"   ");
		}
	}

	public static void main(String[] args) {
		
		Random rand = new Random();
		//LIMITES VOLUME
		int maxV = 50; int minV = 1;
		
		//LIMITES POIDS
		int maxP = 50; int minP = 1;

		//CREATION TABLEAU OBJETS [VOLUME][POIDS]
		int tabObjets[][] = new int[200][2];
		for (int i=0;i<tabObjets.length;i++) {
				tabObjets[i][0]=rand.nextInt(maxV - minV + 1) + minV;
				tabObjets[i][1]=rand.nextInt(maxP - minP + 1) + minP;
		}
		
		//affichageTableau(tabObjets);
		triTableau(tabObjets);
		//System.out.println("\ntri�");
		//affichageTableau(tabObjets);
		
		//SAC A DOS
		int sacDos[][] = new int [100][2];
		int poidsSac = 0;
		int nbreObjets = 0;
		int valeur =0;
		int i=0;
		while (poidsSac<100 && poidsSac+tabObjets[i][1]<100) {
			poidsSac += tabObjets[i][1];
			sacDos[i][0]=tabObjets[i][0];
			sacDos[i][1]=tabObjets[i][1];
			nbreObjets +=1;
			valeur += tabObjets[i][0];
			
			i++;
		}
		//System.out.println("\nSAC");
		//affichageTableau(sacDos);
		//System.out.println("");
		System.out.println("Poids Max : "+poidsSac);
		System.out.println("Valeur : "+valeur);
		System.out.println("Nombre Objets : "+nbreObjets);
	}

}
