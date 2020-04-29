
public class Ingreso extends Dinero{
	private double ingreso;
	private String description;
	
	public Ingreso(double ingreso, String description) {
		this.ingreso = ingreso;
		this.description = description;
	}
	
	public String toString() {
		return this.ingreso +"_"+ this.description;
	}
}
