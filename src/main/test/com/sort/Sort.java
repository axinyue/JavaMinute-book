package com.sort;

import java.util.Iterator;

import org.junit.Test;

public class Sort {
	
	/**	
	 ð������, ÿ�α���ֻ�ܵõ�һ����ֵ
	*/	
	@Test
	public void bubbleSort() {
		int [] a = {1,23,5,76,6,4};
		//�Ӵ�С,ð������
		for(int i=0;i<a.length;i++) {   // �����ֵ ��ǰ����
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
	
	/*Ͱ����*/
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
	TODO  ��������
	 1. ѡ��һ����׼ֵ, һ��Ϊ��һ��ֵ
	 2. �ѱȻ�׼ֵС�ķŵ����,�Ȼ�׼ֵ��ķŵ��ұ�
	*/	
	
	@Test
	public void quickSort() {
		int a[] = {3,56,2};
		int middle = a[0];
		
		int i=0;
		int j=a.length-1;
		
		for(;j>=0;j--) {  // j���Ҳ��Ҵ�����ֵ���� 
			if(a[j]<middle) {
				System.out.println("a[i]: "+a[j]);
				break;
			}
			if(i==j) {
				break;
			}
			
		}
		
		for(;i<a.length;i++) {  //����, i������Ҵ�����ֵ����, j���Ҳ��Ҵ�����ֵ���� 
			if(a[i]>middle) {
				System.out.println("i: "+a[i]);
				break;
			}
			
			
		}
		System.out.println("i: "+i+"   j: "+j);
		
		
		
		
	}
	
}
