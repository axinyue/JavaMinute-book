package com.lesson.L07_Enum;

import org.junit.Test;

/**
 * ö�ٲ���
 * @author computer
 *
 */
public class Oper {
	@Test
	public void getValue() {
		TestType [] values =TestType.values();
		for(TestType tmp:values) {
			System.out.println(tmp.name());
		}
	}
}
