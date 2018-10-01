package firstJavaTask;

//import java.util.Scanner;
import java.util.StringTokenizer;


public class Test {

	public static void main(String[] args) {
		
//		System.out.println("Hello World");
		
//		int x=2;
//		int y=0;
//		System.out.println("La division de "+x+" par "+y+" est : "+(x/y));
//		System.out.println("Fin de calcul");
		
//		int x2;
//		long a=20000000000l;
		
//		int a=5,b=2;
//		float c=(float)a/b;
//		System.out.println(c);
		
//		char s='b';
//		s='6';
//		System.out.println(s);
//		s=66; //le caractère qui correspond à ce code ASCII
//		System.out.println(s);
		
//		int x1=1,x2=2,x3=3,r1,r2,r3,r4,r5;
//		r1=(x1+x2)*x3;
//		System.out.println(r1);
//		r2=x1+x2*x3;
//		System.out.println(r2);
//		r3=x1+(x2*x3);
//		System.out.println(r3);
//		r4=x1+x2;
//		System.out.println(r4);
//		r5=0;
//		r5=r5+r4;
//		System.out.println(r5);
//		r5=0;
//		r5+=r4;
//		System.out.println(r5);
//		x1++;
//		System.out.println(x1);
//		++x1;
//		System.out.println(x1);
//		System.out.println(x1++);
//		System.out.println(++x1);
		
//		String ch = "bonjour ";
//		String ch2 = "tout le monde";
//		System.out.println(ch+ch2);
//		String ch3 = ch + ch2;
//		System.out.println(ch3);
//		System.out.println(ch3.length()); //length est une méthode donc il faut les ()
//		System.out.println(ch.charAt(3));
		
//		int[] tab = new int[3];
//		int tab2[] = new int[3];
//		tab[0]=10;
//		tab[1]=5;
//		tab[2]=3;
//		System.out.println(tab.length); //pas de () car length n'est pas une methode sur le tableau mais une propriété du tableau
//		int tab3[]= {10,5,3};
//		tab3[3]=0;
//		System.out.println(tab3[3]);
//		
//		final int MIN=3; //constante

		
////////EXERCICES		
////////présence d'une valeur dans le tableau		
//		int tab[]= {5,10,8,3,9,4};
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		boolean test=false;
//		for (int i=0;i<tab.length && !test;i++) {
//			if (tab[i]==x) {
//				test=true;
//				System.out.println("la valeur est dans le tableau à la position "+i);
//			}
//		}
//		if (!test) {
//			System.out.println("la valeur n'est pas dans le tableau");
//		}

////////valeur minimale du tableau		
//		int min=tab[0];
//		for (int i=1;i<tab.length;i++) {
//			if (tab[i]<min) min=tab[i];
//		}
//		System.out.println("la valeur minimale du tableau est "+min);

////////moyenne des valeurs positives du tableau		
//		int tab2[]= {5,-10,9,3,-9,4};
//		float somme=0,nombre=0;
//		for (int i=0;i<tab2.length;i++) {
//			if (tab2[i]>=0) {
//				somme+=tab2[i];
//				nombre++;
//			}
//		}
//		System.out.println("la moyenne des valeurs positives du tableau est "+(somme/nombre));

////////compter nombre d'occurrence de la sous-chaine dans la chaine
//		String ch="aabaaababba";
//		String str = "ab";
		
//		//marche pas
//		int count=0;
//		int i=0;
//		
//		while (i!=-1) {
//			if(i>=0 && i!=-1) {
//				i=ch.indexOf(str,i+1);
//				System.out.println("---------------" + i);
//				count++;
//			}
//		}
//		System.out.println(count);
		
		//correction
//		int compteur =0;
//		for(int j=0;j<=ch.length()-str.length();j++) {
//			if((ch.substring(j,j+str.length()).equals(str))) {
//				compteur++;
//			}
//		}
//		System.out.println(compteur);
		
////////compter nbre de phrases et de mots
//		String ch="   salut.bonjour tout le monde. .. .il fait beau  .   ";

//		//si bien écrit (1 et 1 seul espace entre chaque mot)
//		Scanner sc = new Scanner(ch);
//		Scanner sc2 = new Scanner(ch);
//		int nbrmots = 0;
//		int nbrphrases = 0;
//		String t="";
//
//		sc.useDelimiter(" ");
//		while (sc.hasNext()) {
//			t=sc.next();
//			t=t.trim();
//			if(!t.isEmpty()) {
//				nbrmots++;
//			}
//		}
//		System.out.println("nombre de mots "+nbrmots);
//		
//		sc2.useDelimiter("\\.");
//		while (sc2.hasNext()) {
//			t=sc2.next();
//			t=t.trim();
//			if(!t.isEmpty()) {
//				nbrphrases++;
//			}
//		}
//		System.out.println("nombres de phrases "+nbrphrases);
			
//		//plus court avec tableau
//		String []m = ch.split("\\.");
//		int nbremots=m.length;
//		String []p = ch.split(" ");
//		int nbrephrases=p.length;
		
		//StringTokenizer
//		StringTokenizer st = new StringTokenizer(ch,". ");
//		System.out.println("nombre de mots : "+st.countTokens());
//
//		String phrase = ch.replace(" ", "");
//		StringTokenizer st2 = new StringTokenizer(phrase, ".");
//		System.out.println("nombre de phrases : "+st2.countTokens());
		
////////moyenne des valeurs positives non suivies par un négatif
//		int tab [] = {7,8,-1,3,-2,4,2};
//		float somme=0,nombre=0;
//		for (int i=0;i<tab.length-1;i++) {
//			if (tab[i]>=0 && tab[i+1]>0) {
//				somme+=tab[i];
//				nombre++;
//			}
//		}
//		if (tab[tab.length-1]>0) {
//			somme+=tab[tab.length-1];
//			nombre++;
//		}
//		System.out.println("la moyenne des valeurs du tableau est "+(somme/nombre));
//		

////////case qui contient le string avec le plus d'occurrence du substring		
		String tab[]= {"bonjour","bonsoir","il est bon. trop bon","salut"};
		String str="bon";
		int compteur = 0;
		int max=0;
		String ch="";
		
		for (int i=0;i<tab.length;i++) {
			compteur = 0;
			for(int j=0;j<=tab[i].length()-str.length();j++) {
				if((tab[i].substring(j,j+str.length()).equals(str))) {
					compteur++;
				}
			}		
			if (compteur>max) {
				max=compteur;
				ch = Integer.toString(i)+" ";
			}
			else if (compteur==max) {
				ch+=Integer.toString(i)+" ";
			}
		}
		StringTokenizer st = new StringTokenizer(ch, " ");
		while (st.hasMoreTokens()) System.out.println(tab[Integer.parseInt(st.nextToken())]);
	
	}

}
