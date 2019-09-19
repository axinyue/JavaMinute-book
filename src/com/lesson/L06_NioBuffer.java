package com.lesson;

import java.nio.ByteBuffer;

import org.junit.Test;

public class L06_NioBuffer {
	/**
	 * java.nio.ByteBuffer 创建和读取
	 */
	@Test
	public void testBufferReader() {
		
		StringBuilder stringbuilder= new StringBuilder();  // 存放获取到的字符

		ByteBuffer buf = ByteBuffer.wrap("hello world".getBytes());   //使用wrap方法创建一个 ByteBuffer对象
		
		while(buf.hasRemaining()) {
			stringbuilder.append((char)buf.get());    // 使用get()方法，读取字符，并存放到 StringBuilder

		}
		// 使用这种方式读取为什么乱码
//		String a = buf.asCharBuffer().toString());
//		System.out.println(a);
		
		buf.clear();  //清理 ByteBuffer
		System.out.println(stringbuilder.toString()); // 输出StringBuilder中的字符串
	}
	

}
