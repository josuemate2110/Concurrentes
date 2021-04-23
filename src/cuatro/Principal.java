package cuatro;

public class Principal {
	public static String primero = "";
	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Hilo3 h3 = new Hilo3();
		Hilo4 h4 = new Hilo4();
		h3.start();
		h4.start();
		h1.start();
		h2.start();
		
	}
}
