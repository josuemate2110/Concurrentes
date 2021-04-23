package uno;

public class Hilo1 extends Thread{
	@Override
	public void run() {
	for(int i=1; i<=10; i++) {
		System.out.println("Numero: " +i);
		try {
			Hilo1.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
}
