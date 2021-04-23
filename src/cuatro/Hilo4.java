package cuatro;

public class Hilo4 extends Thread{
	@Override
	public void run() {
	for(int i=0; i<=10; i++) {
		System.out.println("Leopardo4 llega al punto: " +i);
		if (i==10) {
			if(Principal.primero.equals("")){Principal.primero="Leopardo4 llego primero";
			System.out.println(Principal.primero);
			}
		}
		}
}
}
