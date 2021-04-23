package tres;
import java.util.Scanner;

public class Hilo1 extends Thread{
	Scanner teclado = new Scanner(System.in);
	@Override
	public void run() {
	long n = 0;
	long x = 1;
	System.out.println("Ingrese numero: ");
	n = teclado.nextInt();
	for(int i=1; i<=n; i++) {
	x = x * i;
	}
	System.out.println("El Factorial es: " + x);
}
}