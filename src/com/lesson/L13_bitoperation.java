package com.lesson;

import junit.framework.TestCase;

public class L13_bitoperation extends TestCase {
	
	/**
	   *   右移运算
	 * 2 0010 >> 0001  1
	 * 4 0100 >> 0010  2
	 * 8 1000 >> 0100  4
	 * 12 1100 >> 0110 6
	 */
	public void test1() {
		int i=12;
		// 右移两位
		int b = i >>> 2;
		System.out.println(b);
		i|=2;
		System.out.println(i);
		System.out.println(i|=0);
		
		// 右移左移的使用
		int j = (1 << 30) +1;
		int MAXVALUE= 1 << 30 ; // 次方 2^30
		int c = j<0 ? 1: (j > MAXVALUE ? MAXVALUE:j);
		System.out.println(c);
		assertEquals(c, MAXVALUE);
	}
	/**
	 * 位或运算,  对应位有一个值为1，值为1
	 * 2(0010) | 3(0011) = 3 (0011) 
	 * 8(0100) | 1(0001) = 9 (0101)
	 * 
	 * 位与运算,  位都为1，值为1
	 * 2(0010) & 3(0011) = 2 (0010)
	 * 6(0110) & 5(0101) = 4 (0100)
	 * 
	 * 异或运算,   位不同值为 1
	 * 2(0010) ^ 3(0011) = 1 (0001)
	 */
	public void test2() {
		// 位或
		int i = 8;
		int b = i|=1;
		System.out.println(b);
				
		// 位与
		int j = 2;
		int c = j&=3;
		System.out.println(c);
		
		// 异或
		int k = 2;
		int d = k^=3;
		System.out.println(d);
		
	}
	
	
}
