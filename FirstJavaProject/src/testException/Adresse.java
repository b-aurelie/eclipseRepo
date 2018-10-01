package testException;

public class Adresse {

	private String rue;
	private String ville;
	private String codePostal;

	public Adresse() {super();}
	
	public Adresse(String rue, String ville, String codePostal) throws IncorrectCodePostalException, IncorrectStreetNameException {
		if(!rue.equals(rue.toUpperCase())) throw new IncorrectStreetNameException();
		if (codePostal.length()!=5) throw new IncorrectCodePostalException();
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) throws IncorrectCodePostalException {
		if (codePostal.length()!=5) throw new IncorrectCodePostalException();
		this.codePostal = codePostal;
	}


	
}
