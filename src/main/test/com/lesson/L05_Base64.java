package com.lesson;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
public class L05_Base64 {
	@Test
	public void encode() {
		
		String s = Base64.encodeBase64String("aaaa".getBytes());
		System.out.println(s);
	}
	
	@Test
	public void decode() {
		String s = Base64.encodeBase64String("aaaa".getBytes());
		System.out.println(s);
		
		String s2 = new String(Base64.decodeBase64(s));
		System.out.println(s2);
		
	}
}
