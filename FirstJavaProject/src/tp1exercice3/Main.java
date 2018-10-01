package tp1exercice3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 2);
		TroisPoints tp = new TroisPoints(p1,p2,p3);
		boolean result = tp.testerAlignement();
		System.out.println(result);
		
		Point p4 = new Point(0, 0);
		Point p5 = new Point((float)1/2, (float)Math.sqrt(3)/2);
		Point p6 = new Point(1, 0);
		TroisPoints tp2 = new TroisPoints(p4,p5,p6);
		boolean result2 = tp2.estTriangleEquilateral();
		System.out.println(result2);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez x1/y1/x2/y2/x3/y3 :");
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line, "/");

		TroisPoints tp3 = new TroisPoints(new Point(Float.parseFloat(st.nextToken()),Float.parseFloat(st.nextToken())),new Point(Float.parseFloat(st.nextToken()),Float.parseFloat(st.nextToken())),new Point(Float.parseFloat(st.nextToken()),Float.parseFloat(st.nextToken())));
		boolean result3 = tp3.testerAlignement();
		System.out.println(result3);
		
	}

}
