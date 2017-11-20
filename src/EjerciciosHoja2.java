import java.io.IOException;
import java.util.Scanner;

public class EjerciciosHoja2 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		/* Ejercicio2 compara dos numeros para saber si son amigos*/
		/*
		System.out.println("Introduce numero1:");
		int n = scanner.nextInt();
		System.out.println("Introduce numero2:");
		int i = scanner.nextInt();
		System.out.println(Ejercicio2(n,i));
		*/
		
		/*Ejercicio3 obtine el primer par de numero amigos */
		/*
		System.out.println(Ejercicio3());
		*/
		
		/*Ejercicio4 obtiene numero amigo entre n numeros*/
		/*
		System.out.println("Introduce numero:");
		int n = scanner.nextInt();
		System.out.println(Ejercicio4(n));
		*/
		
		/*Ejercicio5*/
		/*
		System.out.println("Introduce numero:");
		int n = scanner.nextInt();
		System.out.println(Ejercicio5(n));
		*/
		
		/*Ejercicio6*/
		/*
		System.out.println("Introduce numero1:");
		int n = scanner.nextInt();
		System.out.println("Introduce exponente:");
		int i = scanner.nextInt();
		System.out.println(Ejercicio6(n,i));
		*/
		
		/*Ejercicio7*/
		/*
		System.out.println("Introduce numero de veces n:");
		int n = scanner.nextInt();
		System.out.println("Introduce numero x:");
		int x = scanner.nextInt();
		System.out.println(Ejercicio7(n,x));
		*/
		
		/*Ejercicio8*/
		/*
		System.out.println("Introduce dividendo:");
		double n = scanner.nextDouble();
		System.out.println("Introduce divisor:");
		double i = scanner.nextDouble();
		Ejercicio8(n,i);
		*/
		
		/*Ejercicio9 Suma de numeros pares e impares ¿ambos incluidos?*/
		/*
		System.out.println("Introduce rango minimo:");
		int n = scanner.nextInt();
		System.out.println("Introduce rango maximo:");
		int x = scanner.nextInt();
		System.out.println(Ejercicio9(n,x));
		*/
		
		/*Ejercicio10*/
		
		System.out.println("Introduce cuantos fibonaccis pares quieres:");
		int n = scanner.nextInt();
		System.out.println(Ejercicio10(n));
		
		
		/*Ejercicio11 Suma de numeros primos en 1 y n*/
		/*
		System.out.println("Introduce rango maximo de numeros");
		int n = scanner.nextInt();
		System.out.println(Ejercicio11(n));
		*/
		
		/*Ejercicio12 */
		//Ejercicio12();
		
		
		/*Obtener n fibonnaci */
		/*
		System.out.println("Introduce cuantos fibonaccis quieres:");
		int n = scanner.nextInt();
		for(int x :getNFibonnaci(n))
		System.out.println(x);
		*/
		/*Obtener facorial*/
		/*
		System.out.println("Introduce numero:");
		int n = scanner.nextInt();
		System.out.println(getFactorial(n));
		*/
		
		/*Ejercicio13*/
		//System.out.println(Ejercicio13(0.4));
		
		/*Ejercicio14*/
		//System.out.println(Ejercicio14(1234));

		/*Ejercicio15*/
		/*
		System.out.println(Ejercicio15(5,"'"));
		Logger.WriteLine(Ejercicio15(5, "'"));
		*/
		
		/*Ejercicio16*/
		/*
		System.out.println(Ejercicio16(7));
		*/

		System.out.println("Fin de programa");
	}
	
	//-------------------EJERCICIOS----------------//
	public static int Ejercicio1(int numero) {
		double acumulador = 0;	
		int contador = 0;
		for(int i = 1; acumulador < numero; i++ )
		{
			contador++;
			acumulador += (double)1/i;
		}
		return contador;
	}
	public static boolean Ejercicio2(int numero1, int numero2) {
		return isAmigo(numero1, numero2);
	}
	public static String Ejercicio3() {
		String result = "";
	
		for(int i = 0;i < 10000; i++) {
			for(int x = 0; x < 10000; x++) {
				if(isAmigo(i,x))
					return result += String.valueOf(i) + "||"  + String.valueOf(x) + "\n";
			}
		}
		return result;
	}
	public static String Ejercicio4(int numero) {
		String result = "";
		for(int i = 0;i < numero; i++) {
			for(int x = 0; x < numero; x++) {
				if(isAmigo(i,x)) {
					result += String.valueOf(i) + "||"  + String.valueOf(x) + "\n";
				}
			}
		}
		return result;
	}
	public static String Ejercicio5(int numero) {
		String result = "";
		for(int i = 1; i <= numero; i++) {
			if(isDivisible(numero,i) && isPrimo(i)) {
				result += String.valueOf(i) + "||";
			}
		}
		return result;
	}
	public static int Ejercicio6(int numero, int exponente) {
		int result = numero;
		for(int i = 1; i < exponente; i++) {
			result = result * numero;
		}
		return result;
	}
	public static double Ejercicio7(int nTerminos , int x) {
		double result = 1;
			for(int i = 1; i<= nTerminos;i++) {
				result += x/i;
			}
		return result;
	}
	public static void Ejercicio8(double dividendo, double divisor) {
		double cociente = 0;
		double resto = divisor;
		double div = dividendo;
		
		while(resto >= divisor ) {
			cociente++;
			resto = div - divisor;
			div = resto;
		}
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);
	}
	public static String Ejercicio9(int rangoMin, int rangoMax) {
		
		int resultPar = 0;
		int resultImpar = 0;
		String result = "";
		for(int i = rangoMin; i <= rangoMax; i++) {
			if(isPar(i)) {
				resultPar += i;
			} else {
				resultImpar += i;
			}
		}
		return result = "SumaPar:" + String.valueOf(resultPar) + "||" + "SumaImpar:" + String.valueOf(resultImpar);
	}
	public static String Ejercicio10(int numero) {
		String result = "";
		int fibo = 0;
		int anterior = 1;

		for(int i = 0; i < numero;i++) {
			if(isPar(fibo)) {
				result += String.valueOf(fibo) + "||";
			} else {
				i--;
			}
				fibo = fibo + anterior;
				anterior = fibo - anterior;
		}
		return result;
	}
	public static int Ejercicio11(int numero) {
		int result = 0;
		for(int i = 1; i <= numero; i++) {
			if(isPrimo(i)) {
				result += i;
				System.out.println(i);
			}
		}
		return result;
	}
	public static void Ejercicio12() {
		String result = "";
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m < 60; m++) {
				for(int s = 0; s < 60; s++) {
					result = h + "-" + m + "-" + s;
					System.out.println(result);
					//Logger.WriteLine(result);
				}
			}
		}
	}
	public static int Ejercicio13(double x ) {
		int counter = 0;
		if(x > 1 || x < 0)
			return counter;
		double result = 0;
		for(int i = 1; result < x; i++) {
			counter++;
			result += 1/Math.pow(2, i);
			//System.out.println(result);
		}
		return counter;
	}
	public static int Ejercicio14(int numero) {
		int result = 0;
		String[] cadena = String.valueOf(numero).split("");
		
		for(int i = 0; i < cadena.length; i++) {
			System.out.println(Integer.valueOf(cadena[i]));
			result += Integer.valueOf(cadena[i]);
		}
		return result;
	}
	public static String  Ejercicio15(int numero,String blanco) {
		String arbol = "";
		int emptySize = numero - 1;
		String simbolo = String.valueOf(numero);
		int multipler = simbolo.length();
		for(int i = 1; i < numero;i++) {
			int currentSize = i * 2;
			arbol +=  getCaracters(blanco, emptySize * multipler) + getCaracters(simbolo, currentSize) +  getCaracters(blanco, emptySize * multipler) + "\n"; 
			emptySize--; 
		}
		return arbol;
	}
	public static String Ejercicio16(int numero) {
		String result = "";
		for(int i = 1; i <= numero; i++) {
			int numeroDeCeros = i - 1;
			result += getSecuencia(i,numero) + getCaracters("0", numeroDeCeros) +  "\n";
		}
		return result;
	}
	public static String ordenarAscendente(int a, int b , int c, int d) {
		String result = "";
		
		if(a < b && a < c && a < d) {
			
		}
		
		return result;
	}
	//-------------------HELPERS----------------//
	public static String getSecuencia(int start, int end) {
		String result = "";
		for(int i = start; i <= end;i++) {
			result += String.valueOf(i);
		}
		return result;
	}
	public static String getCaracters(String caracter, int numero) {
		String result = "";
		for(int i = 0;  i < numero; i++) {
			result += caracter;
		}	
		return result;
	}
	public static int[] getNFibonnaci(int number) {
		int[] result = new int[number];
		int counter = 0;
		int fibo = 0;
		int anterior = 1;
		
		for(int i = 0; counter < number;i++) {
			result[counter] = fibo;
			counter++;
			fibo = fibo + anterior;
			anterior = fibo - anterior;
		}
		return result;
	}
	public static boolean isPar(int numero) {
		if(numero % 2 == 0) return true;
		return false;
	}
	public static int getFactorial(int n) {
		int result = 1;
		for(int i = n; i > 0; i-- ) {
			result = result * i;
		}
		return result;
	}
	public static boolean isAmigo(int numero1, int numero2) {
		if(numero1 == numero2) return false;
		if(sumaDivisores(numero1) == numero2 &&  sumaDivisores(numero2) == numero1) return true;	
		return false;		
	}
	public static int sumaDivisores(int numero) {
		int suma = 0;
		for(int i = 1; i < numero; i++) {
			if(isDivisible(numero,i))
				suma += i;
		}
		return suma;
	}
	public static boolean isDivisible(int numero, int divisor) {
		if(numero % divisor == 0) return true;
		return false;
	}
	public static boolean isPrimo(int numero) {
		if(numero == 1) return false;
		for(int i = 2; i < numero; i++)
			if(numero % i == 0) return false;
		return true;
	}
	
}
