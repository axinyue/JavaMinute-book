package com.lesson.L10;

import org.junit.Test;

public class SwitchTest {
	
	@Test
	public void testOne() {
		MyType a = MyType.TypeA;
		
		switch(a) {
			case TypeA:
				System.out.println("1");
			case TypeB:
				System.out.print("2");
				break;
			default:
				System.out.print("break");

				break;
		}
		
	}
}
