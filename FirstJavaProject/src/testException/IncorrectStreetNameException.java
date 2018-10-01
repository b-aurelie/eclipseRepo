package testException;

public class IncorrectStreetNameException extends Exception {
	
	public IncorrectStreetNameException() {
		System.out.print("Le nom de la rue doit etre en majuscule");
	}
}