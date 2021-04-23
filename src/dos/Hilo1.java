package dos;

public class Hilo1 extends Thread{
	@Override
	public void run() {
	int a = 2;
	int b = 7;
	int c = 5;
	int d = 4;
	int e = 9;
	int f = 3;
	int g = 6;
	int h = 8;
	int i = 1;
	int j = 10;
	double k = Math.pow(a, 3);
	double l = Math.pow(b, 3);
	double m = Math.pow(c, 3);
	double n = Math.pow(d, 3);
	double o = Math.pow(e, 3);
	double p = Math.pow(f, 3);
	double q = Math.pow(g, 3);
	double r = Math.pow(h, 3);
	double s = Math.pow(i, 3);
	double t = Math.pow(j, 3);
	double x = k+l+m+n+o+p+q+r+s+t;
	System.out.println("La suma de los cubos de la lista {2, 7, 5, 4, 9, 3, 6, 8, 1, 10} es: " + x);
	}
}
