package br.com.telefonica.chocolate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.telefonica.chocolate.enums.ChocolateType;
import br.com.telefonica.chocolate.service.ChocolateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "Chocolate Controller", description = "API para calcular a quantidade de cacau necessária para cada tipo de chocolate")
@RestController
@RequestMapping("/api/chocolate")
public class ChocolateController {

	@Autowired
	private ChocolateService chocolateService;

	@ApiOperation(value = "Calcula a quantidade de cacau para um tipo específico de chocolate")
	@GetMapping("/calculateCocoa/{type}/{totalAmount}")
	public double calculateCocoaAmount(
			@ApiParam(value = "Tipo de chocolate (A, B ou C)", required = true) @PathVariable("type") ChocolateType type,
			@ApiParam(value = "Quantidade total de ingredientes", required = true) @PathVariable("totalAmount") double totalAmount) {

		return chocolateService.calculateCocoaAmount(type, totalAmount);
	}
}