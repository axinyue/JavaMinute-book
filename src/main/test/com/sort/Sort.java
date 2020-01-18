package com.sort;

import java.util.Iterator;

import org.junit.Test;

public class Sort {
	
	/**	
	 冒泡排序, 每次遍历只能得到一个最值
	*/	
	@Test
	public void bubbleSort() {
		int [] a = {1,23,5,76,6,4};
		//从大到小,冒泡排序
		for(int i=0;i<a.length;i++) {   // 把最大值 靠前放置
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int tmp = a[i];
					a[i]=a[j];
					a[j] = tmp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	/*桶排序*/
	@Test
	public void tongSort() {
		int maxnum = 100;

		int[] a = {1,23,4,5};
		int[] b = new int[maxnum];
		
		for(int i=0;i<a.length;i++) {
			b[a[i]] +=1;
		}
		
		for(int i=0;i<b.length;i++) {
			if(b[i]!=0) {
				System.out.print(" "+i);
			}
			
		}
	}
	
	/**	
	TODO  快速排序
	 1. 选择一个基准值, 一般为第一个值
	 2. 把比基准值小的放到左边,比基准值大的放到右边
	*/	
	
	@Test
	public void quickSort() {
		int a[] = {3,56,2};
		int middle = a[0];
		
		int i=0;
		int j=a.length-1;
		
		for(;j>=0;j--) {  // j从右查找大于中值的数 
			if(a[j]<middle) {
				System.out.println("a[i]: "+a[j]);
				break;
			}
			if(i==j) {
				break;
			}
			
		}
		
		for(;i<a.length;i++) {  //便利, i从左查找大于中值的数, j从右查找大于中值的数 
			if(a[i]>middle) {
				System.out.println("i: "+a[i]);
				break;
			}
			
			
		}
		System.out.println("i: "+i+"   j: "+j);
		
		
		
		
	}
	
}
