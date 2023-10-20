package br.com.telefonica.chocolate.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.telefonica.chocolate.enums.ChocolateType;

class ChocolateServiceTest {

	private final ChocolateService chocolateService = new ChocolateService();

	@Test
	void testCalculateCocoaAmountForTypeA() {
		double actualAmount = chocolateService.calculateCocoaAmount(ChocolateType.A, 100);
		assertEquals(80, actualAmount);
	}

	@Test
	void testCalculateCocoaAmountForTypeB() {
		double actualAmount = chocolateService.calculateCocoaAmount(ChocolateType.B, 100);
		assertEquals(85, actualAmount);
	}

	@Test
	void testCalculateCocoaAmountForTypeC() {
		double actualAmount = chocolateService.calculateCocoaAmount(ChocolateType.C, 100);
		assertEquals(90, actualAmount);
	}
}