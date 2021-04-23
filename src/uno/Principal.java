package uno;

public class Principal {

	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		h1.start();
		try {
			h1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		h2.start();
		try {
			h2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
