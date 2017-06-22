/**
 * 选择排序（Selection sort）是一种简单直观的排序算法。
 * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
 * 存放在序列的起始位置，直到全部待排序的数据元素排完。
 *  选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，
 *  导致第一个5挪动到第二个5后面）。
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017年6月21日 下午10:29:48
 */
public class ChooseSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(arg0);
		BubbleSort.print(BubbleSort.a);
		ChooseSort.sort(BubbleSort.a);
		BubbleSort.print(BubbleSort.a);
	}
	public static void sort(int []a){
		int l=a.length;
		int temp=0;
		for(int i=0;i<l;i++){
			temp=i;
			for(int j=i+1;j<l;j++){
				if(a[temp]>a[j])
					temp=j;
			}
			if(temp!=i){
				a[temp]^=a[i];
				a[i]^=a[temp];
				a[temp]^=a[i];
			}	
		}
	}
}
