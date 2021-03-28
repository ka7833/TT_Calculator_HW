
public class MagicCalculator extends Calculator {
	public double squareRoot(int num1) {
		return Math.sqrt(num1);
	}

	public double sin(int num1) {
		return Math.sin(num1);
	}

	public double cos(int num1) {
		return Math.cos(num1);
	}

	public double tan(int num1) {
		return Math.tan(num1);
	}

	public int factorial(int num1) {
		if (num1 == 0)
			return 1;
		else
			return num1 * factorial(num1 - 1);
	}
}
