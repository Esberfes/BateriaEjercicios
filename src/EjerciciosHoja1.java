import java.util.Scanner;

public class EjerciciosHoja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Primer numero");
		double a = scanner.nextDouble();
		System.out.println("Segundo numero");
		double b = scanner.nextDouble();
		System.out.println("Tercer numero");
		double c = scanner.nextDouble();
		ejercicio2(a,b,c);

		
	}
	//Resolución de ecuaciones de ecuaciones de segundo grado
	public static void ejercicio2(double a , double b , double c) {
		//s1 = -b - sqrt(b2 - 4 *  a * c ) / 2 * a
		//s2 = -b + sqrt(b2 - 4 *  a * c ) / 2 * a
		//si d < 0 no hay soluciones
		//si d == 0 solo hay una solucion
		//
		if(a == 0) {
			a = 1;
		}
		if(b == 0) {
			b = 1;
		}
		if(c == 0) {
			c = 1;
		}
		double s1 = 0;
		double s2 = 0;
		
		double d = Math.pow(b, 2) - 4 * a * c;
		
		if(d < 0) {
			//No hay soluciones
			System.out.println("No hay soluciones");
		} else if ( d == 0) {
			//Solo hay una solucion
			s1 = -b / (2 * a);
			s2 = s1;
			System.out.println("SolucionUnica: " + s1);
		} else {
			//Dos soluciones
			s1 = (-b + (Math.sqrt(d)))/ (2 * a);
			s2 = (-b - (Math.sqrt(d))) / (2 * a);
			System.out.println("Solucion1: " + s1);
			System.out.println("Solucion2: " + s2);
		}
	}
}
