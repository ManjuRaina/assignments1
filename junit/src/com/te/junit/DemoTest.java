package com.te.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class DemoTest {
	
	Demo demo;
	
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Before Everthing");
	}
	
	
	@BeforeEach
	void init() {
		demo=new Demo();
		System.out.println("new instance created");
	}
	
	@Test
	@DisplayName("ADDITION")
	void test() {
		assertEquals(6,demo.add(2,4));
		System.out.println("addition completed");
		}
	
 @Test
 @DisplayName("MULTIPLICATION")
	void multi() {
		assertEquals(8,demo.multi(4,2));
		System.out.println("multiplication completed");

	}
 @Test
 void division() {
	 assertThrows(ArithmeticException.class,()->demo.division(10,5));
 }

}
