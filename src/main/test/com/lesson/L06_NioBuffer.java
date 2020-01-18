package com.lesson;

import java.nio.ByteBuffer;

import org.junit.Test;

public class L06_NioBuffer {
	/**
	 * java.nio.ByteBuffer �����Ͷ�ȡ
	 */
	@Test
	public void testBufferReader() {
		
		StringBuilder stringbuilder= new StringBuilder();  // ��Ż�ȡ�����ַ�

		ByteBuffer buf = ByteBuffer.wrap("hello world".getBytes());   //ʹ��wrap��������һ�� ByteBuffer����
		
		while(buf.hasRemaining()) {
			stringbuilder.append((char)buf.get());    // ʹ��get()��������ȡ�ַ�������ŵ� StringBuilder

		}
		// ʹ�����ַ�ʽ��ȡΪʲô����
//		String a = buf.asCharBuffer().toString());
//		System.out.println(a);
		
		buf.clear();  //���� ByteBuffer
		System.out.println(stringbuilder.toString()); // ���StringBuilder�е��ַ���
	}
	

}
