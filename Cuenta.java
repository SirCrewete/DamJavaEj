import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos= new ArrayList<>();
	private List<Ingreso> ingresos= new ArrayList<>();
	
	public Cuenta (Usuario usuario) {
		this.usuario = usuario;
		this.saldo = 15;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public double addIngresos(String description, double cantidad) {
		Ingreso nuevoIngreso = new Ingreso(cantidad, description);
		this.saldo = this.saldo + cantidad;
		this.ingresos.add(nuevoIngreso);
		System.out.println(ingresos);
		return this.saldo;
	}
	public double addGastos(String description, double cantidad){
		if(this.saldo >= cantidad) {
			//si tenemos saldo.
			this.saldo = this.saldo - cantidad;
			Gasto newGasto = new Gasto(cantidad, description);
			this.gastos.add(newGasto);
			System.out.println(this.gastos);
			return this.saldo;
		}else {
			//no tenemos saldo.
			GastoException gastoFallido = new GastoException();
			System.out.println("No tienes saldo.");
			return this.saldo;
		}		
	}
	
	public List<Ingreso> getIngresos(){
		return this.ingresos;
	}
	
	public List<Gasto> getGastos(){
		System.out.println("hello");
		return this.gastos;
	}
}
