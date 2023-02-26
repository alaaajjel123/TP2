package functions;

public class Triangle {
	
	public static int type(double a, double b, double c) {
        //triangle est invalide
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        //équilatéral
        else if (a == b && b == c) {
            return 1;
        }
        //isocèle
        else if (a == b || b == c || a == c) {
            return 2;
        }
        //valide mais ni équilatéral ni isocèle
        else {
            return 3;
        }
    }

}
