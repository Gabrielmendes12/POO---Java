package exemplosmetodos;

public class Incremento2 {
	public static void main (String argv[]) {
		
		int x, y, z;
		x = y = 10;
		z = ++x; // pré incremento -> z recebe o valor de x=x+1, logo x = z = 11
		System.out.println("x =" +x);
		System.out.println("z =" +z);
		
		System.out.println();
		
		x = -x; // inverso de x
		System.out.println("x = "+x);
		y++;
		System.out.println("y = "+y);
		
		System.out.println();
		
		x = x + y - (z--);  // -11 + 11 -11 = -11
		System.out.println("x = "+x);
		
		System.out.println("y = "+y);
		
		System.out.println("z = "+z);
		
		System.out.println();
	}

}
