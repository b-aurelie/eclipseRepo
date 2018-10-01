package thirdJavaTask;

public class Humain <T>{
	
	private T var;

	public Humain(T var) {
		this.var = var;
	}

	public T getVar() {
		return var;
	}
	
	public void setVar(T var) {
		this.var = var;
	}
}
