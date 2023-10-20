package br.com.telefonica.chocolate.strategy;

public class TypeAStrategy implements ChocolateStrategy {
	@Override
	public double calculateCocoaAmount(double totalAmount) {
		return totalAmount * 0.8;
	}
}
