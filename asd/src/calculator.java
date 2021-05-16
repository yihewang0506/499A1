package asd.src;


public class calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double substract(double a, double b) {
		return a + b;
	}

	public double mutiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Donot divide by 0");
		}
		return a / b;
	}
	
}
