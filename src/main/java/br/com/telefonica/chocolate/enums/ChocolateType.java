package br.com.telefonica.chocolate.enums;

import br.com.telefonica.chocolate.strategy.ChocolateStrategy;
import br.com.telefonica.chocolate.strategy.TypeAStrategy;
import br.com.telefonica.chocolate.strategy.TypeBStrategy;
import br.com.telefonica.chocolate.strategy.TypeCStrategy;

public enum ChocolateType {

	A(new TypeAStrategy()), B(new TypeBStrategy()), C(new TypeCStrategy());

	private final ChocolateStrategy strategy;

	ChocolateType(ChocolateStrategy strategy) {
		this.strategy = strategy;
	}

	public ChocolateStrategy getStrategy() {
		return this.strategy;
	}
}