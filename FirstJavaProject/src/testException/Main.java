package testException;

public class Main {

	public static void main(String[] args) {
	
//		int x=0,y=5;
//		try {
//			System.out.println(y/x);
//		}
//		catch (Exception e) {
//			System.out.println("Exception : " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("Fin de calcul");
		
//		float x=0,y=5;
//		try {
//			System.out.println(y/x);
//		}
//		catch (Exception e) {
//			System.out.println("Exception : " + e.getMessage());
//			e.printStackTrace();
//		}
			
		Adresse a = null;
		try {a = new Adresse ("paradis", "Marseille","1300");}
		catch (IncorrectCodePostalException | IncorrectStreetNameException e) {e.printStackTrace();}
		finally {System.out.println("Instruction executee systematiquement");}
		
	}

}
