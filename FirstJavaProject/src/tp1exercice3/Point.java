package tp1exercice3;

public class Point {

	private float abs,ord;

	public Point(float abs, float ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}

	public float getAbs() {
		return abs;
	}

	public void setAbs(float abs) {
		this.abs = abs;
	}

	public float getOrd() {
		return ord;
	}

	public void setOrd(float ord) {
		this.ord = ord;
	}
	
	public float calculerDistance(Point p){
		return (float) Math.sqrt(Math.pow(this.abs-p.abs,2)+Math.pow(this.ord-p.ord,2));
	}
	
	public Point calculerMilieu(Point p) {
		return new Point((this.abs+p.abs)/2, (this.ord+p.ord)/2);	 
	}
}
