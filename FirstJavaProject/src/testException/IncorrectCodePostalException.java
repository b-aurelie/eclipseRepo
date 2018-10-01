package testException;

public class IncorrectCodePostalException extends Exception {
	
	// le constructeur de cette nouvelle exception
	public IncorrectCodePostalException(){
	System.out.println("Le code postal doit contenir exactement 5 chiffres");
	}
}
