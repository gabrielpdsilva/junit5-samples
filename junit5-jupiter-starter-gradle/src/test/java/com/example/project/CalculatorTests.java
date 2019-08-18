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

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@Test
	@DisplayName("2 - 1 = 1")
	void subsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.sub(2, 1), "2 - 1 should equal 1");
	}
	
	@Test
	@DisplayName("4 * 2 = 8")
	void multsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.mult(4, 2), "4 * 2 should equal 8");
	}
	
	@Test
	@DisplayName("8 / 2 = 4")
	void divsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.div(8, 2), "8 / 2 should equal 4");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
