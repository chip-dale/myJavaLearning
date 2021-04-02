public class Calculator {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int diff(int a, int b) {
		return a - b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		if(b != 0) {
			double result = (double) a / b;
			return result;
		} else {
			System.out.println("ERROR! You cannot divide by 0");
			return Double.NaN;
		}
	}
	
	public static int pow(int a, int b) {
		   int result = 1;
		   for (int i = 0; i < b; i++) {
		       result *= a;
		   }
		   return result;
		}
}
