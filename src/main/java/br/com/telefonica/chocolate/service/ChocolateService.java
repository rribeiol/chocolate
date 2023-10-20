package br.com.telefonica.chocolate.service;

import org.springframework.stereotype.Service;

import br.com.telefonica.chocolate.enums.ChocolateType;

@Service
public class ChocolateService {

	public double calculateCocoaAmount(ChocolateType type, double totalAmount) {
		return type.getStrategy().calculateCocoaAmount(totalAmount);
	}

}