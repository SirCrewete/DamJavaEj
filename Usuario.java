
public class Usuario{
	private String nombre;
	private int edad;
	private String DNI;
	
	public Usuario() {
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public boolean setDNI(String DNI) {
		this.DNI = DNI;
		return true;
	}
	
	public String toString() {
		return this.nombre+this.edad+this.DNI;
	}
	
	
}
