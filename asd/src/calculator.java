package asd.src;


public class calculator {
	//this is add function
	public double add(double a, double b) {
		return a + b;
	}
	//this is sub function
	public double substract(double a, double b) {
		return a - b;
	}
	// this is mul function
	public double mutiply(double a, double b) {
		return a * b;
	}
	//this is divide function
	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Donot divide by 0");
		}
		return a / b;
	}
	
}
