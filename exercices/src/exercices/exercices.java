package exercices;

public class exercices {

	public static void main(String[] args) {
		
		//TRI A BULLES
		int tab[] = {8,7,0,5,9,2,3,1,4,6};
		int temp = 0;

		for(int i=tab.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(tab[j+1]<tab[j]) {
					temp = tab[j+1];
					tab[j+1] = tab[j];
					tab[j] = temp;
				}
			}
		}
		for (int i=0;i<tab.length;i++) {
			System.out.print(tab[i]);	
		}
		System.out.println("");
		
		//TRI PAR SELECTION
		int tab2[] = {8,7,0,5,9,2,3,1,4,6};
		int indiceMini = 0;
		for(int i=0;i<tab2.length;i++) {
			indiceMini=i;
			for (int j=i+1;j<tab2.length;j++) {
				if (tab2[j]<tab2[indiceMini]) {
					indiceMini = j;
				}
			}
			temp = tab2[indiceMini];
			tab2[indiceMini]=tab2[i];
			tab2[i]=temp;
		}
		for (int i=0;i<tab2.length;i++) {
			System.out.print(tab2[i]);
		}
	}	
}
