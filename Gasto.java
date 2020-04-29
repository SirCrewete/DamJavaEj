
public class Gasto extends Dinero{
	private double gasto;
	private String description;
	
	public Gasto(double gasto, String description) {
		this.gasto = gasto;
		this.description = description;
	}
	
	public String toString() {
		return this.gasto + "_" + this.description;
	}
}
