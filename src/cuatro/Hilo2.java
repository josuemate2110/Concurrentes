package cuatro;

public class Hilo2 extends Thread{
	@Override
	public void run() {
	for(int i=0; i<=10; i++) {
		System.out.println("Leopardo2 llega al punto: " +i);
		if (i==10) {
			if(Principal.primero.equals("")){Principal.primero="Leopardo2 llego primero";
			System.out.println(Principal.primero);
			}
		}
		}
}
}
