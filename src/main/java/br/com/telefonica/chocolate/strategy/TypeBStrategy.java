package br.com.telefonica.chocolate.strategy;

public class TypeBStrategy implements ChocolateStrategy {
	@Override
	public double calculateCocoaAmount(double totalAmount) {
		return totalAmount * 0.85;
	}
}
