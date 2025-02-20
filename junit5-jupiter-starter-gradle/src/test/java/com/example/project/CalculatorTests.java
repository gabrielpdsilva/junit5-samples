/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
/*
	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 deveria ser 2");
	}
	
	@Test
	@DisplayName("2 - 1 = 1")
	void subsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.sub(2, 1), "2 - 1 deveria ser 1");
	}
	
	@Test
	@DisplayName("4 * 2 = 8")
	void multsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.mult(4, 2), "4 * 2 deveria ser 8");
	}
	
	@Test
	@DisplayName("8 / 2 = 4")
	void divsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.div(8, 2), "8 / 2 deveria ser 4");
	}*/

	//======================================================================
	
	//método add
	//teste de soma
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1.5,    2,   3.5",
			"49,  51, 100",
			"'a',  'a', 1",
			"0,  0, 0",
			"100, -101, -1"
	})
	void add(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " deveria ser " + expectedResult);
	}
	
	//método sub
	//teste de subtração
	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"0,    -1,   -1",
			"2.5,    1,   1.5",
			"2,  2, 0",
			"15,  10, 5",
			"1,  1, 0",
			"'a', 1, 1"
	})
	void sub(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " deveria ser " + expectedResult);
	}
	
	//método mult
	//teste de multiplicação
	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1.5,    2,   3",
			"2,  2, 4",
			"3,  -5, -15",
			"2.5,  3, 7.5",
			"'a', 1, 1"
	})
	void mult(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.mult(first, second),
				() -> first + " * " + second + " deveria ser " + expectedResult);
	}
	
	//método div
	//teste de divisão
	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({
			"-8,    1,   -8",
			"5,    2.5,   2",
			"4,  4, 1",
			"7,  2, 3.5",
			"4,  2, 2",
			"'a', 1, 1"
	})
	void div(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.div(first, second),
				() -> first + " / " + second + " deveria ser " + expectedResult);
	}
}
