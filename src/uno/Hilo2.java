package uno;

public class Hilo2 extends Thread{
	@Override
	public void run() {
	for(int i=10; i>=1; i--) {
		System.out.println("Numero: " +i);
		try {
			Hilo1.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
}
