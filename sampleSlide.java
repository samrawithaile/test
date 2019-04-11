package lesson4;

public class sampleSlide {
	public static void main(String[] args) {
		sampleSlide f = new sampleSlide();
		
		System.out.println("The result with Recursion: " + f.factorial(3));
		
		System.out.println("The result without using Recursion: " + f.factorialWithoutRecursion(5));
	}
	int factorial(int n) {
		System.out.println("Entering factorial with n = " + n);
		if (n == 0 || n == 1) {
			System.out.println("Returning val " + 1 + " of factorial(1)");
			return 1;
		}
		int retVal = n * factorial(n - 1);
		System.out.println("Returning val " + retVal + " of factorial(" + n
				+ ")");
		return retVal;
	}

	int factorialWithoutRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		for (int i = 1; i <= n; ++i) {
			result *= i;
		}
		return result;
	}

}

	
