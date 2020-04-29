import java.awt.print.Printable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	private static Scanner lectura = new Scanner(System.in);
	private static String nombreUsuario;
	private static String dniUsuario;
	private static int edadUsuario = 0;
	private static int eleccion;
	private static Usuario newUsuario;
	private static String edadUsuario2;
	private static String descripcionGasto;
	private static String descripcionIngreso;
	private static double cantidadGasto;
	private static double cantidadIngreso;
	private static Cuenta nuevaCuenta;
	private static List<Ingreso>listaIngresos = new ArrayList<Ingreso>(); 
	private static List<Gasto>listaGastos = new ArrayList<Gasto>(); 
	
	//String correctDNI = "(\\d{8})([-]?)([A-Z]{1})";
	//boolean dniCheck = Pattern.matches(correctDNI, dniUsuario);
	

	
	
	private static boolean loginUsuario() {
		do {
		System.out.println("Introduce el nombre de usuario: ");
		nombreUsuario = lectura.nextLine();
		}while(nombreUsuario.isEmpty());
		
		do {
		System.out.println("Introduce la edad del usuario: ");
		edadUsuario = lectura.nextInt();
		try {
			edadUsuario=Integer.parseInt(edadUsuario2);
			if(edadUsuario<=0) {
				System.out.println("La edad debe ser mayor que cero");
			}
		}catch(Exception e) {
			System.out.println("Debes introducir un n�mero "
					+ "mayor de cero para la edad");
		}	
	}while(edadUsuario2.isEmpty() || edadUsuario<=0);
		
		do {
		System.out.println("introduce el DNI del usuario: ");
		dniUsuario = lectura.nextLine();
		dniUsuario=dniUsuario.toUpperCase();
		}while(dniUsuario.isEmpty()
				|| dniUsuario.length()<9 || dniUsuario.length()>10);
				System.out.println("************************");
				return true;
	}
		
	private static void crearUsuario() {
		
		Usuario newUsuario = new Usuario();
		
		newUsuario.setNombre(nombreUsuario);
		newUsuario.setEdad(edadUsuario);
		newUsuario.setDNI(dniUsuario);
	}
	
	
	
	public static void main(String[] args) {
		

		Usuario nuevoUsuario = new Usuario(nombreUsuario, edadUsuario, dniUsuario);
		Cuenta cuentaUsuario = new Cuenta(nuevoUsuario);
		System.out.println("Bienvenido "+nombreUsuario+".");
			
			System.out.println("Realiza una nueva acción");
			System.out.println("1. Introduce un nuevo gasto");
			System.out.println("2. Introduce un nuevo ingreso.");
			System.out.println("3. Mostrar gastos.");
			System.out.println("4. Mostrar ingresos.");
			System.out.println("5. Mostrar saldo.");
			System.out.println("0. Salir.");
			
			
			
			
			
			System.out.println("Seleccione una opcion: ");
			int eleccion = lectura.nextInt();
			
			switch (eleccion) {
			case 1: 
				//NUEVO GASTO
				System.out.println("Introduce la descripción: ");
				String descripcionGasto = lectura.nextLine();
				System.out.println("Introduce la cantidad: ");
				double cantidadGasto = lectura.nextDouble();
				double saldoActualPrueba = cuentaUsuario.addGastos(descripcionGasto, cantidadGasto);
				System.out.println("Saldo restante: "+ saldoActualPrueba);
				break;
		
			case 2:
				//NUEVO INGRESO
				System.out.println("Introduce la descripción: ");
				String descripcionIngreso = lectura.nextLine();
				System.out.println("Introduce la cantidad: ");
				double cantidadIngreso = lectura.nextDouble();
				double saldoActual = cuentaUsuario.addIngresos(descripcionIngreso, cantidadIngreso);
				System.out.println("Saldo total: "+ saldoActual);
				break;
			
			case 3:
				
				//MOSTRAR GASTOS
				
				/*
				cuentaUsuario.getGastos();
				/*
				for (int i = 0; i < getGastos().lenght; i++) {
					System.out.println(getGastos().element(i));
				}
				break;
				*/
				
				if (cuentaUsuario.getGastos()==null) {
					System.out.println("No hay gastos.");
				}else {
					System.out.println(cuentaUsuario.getGastos());
				}
				
			case 4:
				//MOSTRAR INGRESOS
				if(cuentaUsuario.getIngresos()==null) {
					System.out.println("No hay ingresos.");
				}else {
					System.out.println(cuentaUsuario.getIngresos());
				}
				break;
				
			case 5: 
				//SALDO ACTUAL
				double saldoUsuarioActual = cuentaUsuario.getSaldo();
				System.out.println("Tus saldo actual es de: " + saldoUsuarioActual + " $");
				break;
				
			case 0:
				//EXIT
				System.exit(0);
			}
			
			
		
	}
}













/*
 
Scanner dato1 = new Scanner(System.in);
Scanner dato2 = new Scanner(System.in);
Scanner dato3 = new Scanner(System.in);
Scanner eleccionUsuario = new Scanner(System.in);
Scanner datoCantidadIngreso = new Scanner(System.in);
Scanner datoNumeroIngreso = new Scanner(System.in);
Scanner datoDescripcionGasto = new Scanner(System.in);
Scanner datoCantidadGasto = new Scanner(System.in);

*/