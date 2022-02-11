package Calcs;

public class CalcMethod implements Calculator {
	
	private double num1;
	private double num2;
		
	public CalcMethod(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		}
		
	@Override
	public double addition() {
		return num1 + num2;
	}
	@Override
	public double subtraction() {
		return num1 - num2;
	}
	@Override
	public double multiplication() {
		return num1 * num2;
	}
	@Override
	public double division() {
		return num1 / num2;
	}
	
	

}
