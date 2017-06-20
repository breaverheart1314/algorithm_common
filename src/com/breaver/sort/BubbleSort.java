/**
 * 
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017年6月20日 下午6:30:24
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static <T>T[] funtion(T t[]){
		//泛型怎么用
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,1,5,6,7,9,2,1,3};
//		System.out.println("===");
		BubbleSort.print(a);
		BubbleSort.sort(a);
		BubbleSort.print(a);
	}
	public static void print(int a[]){
		int l=a.length;
		for(int i=0;i<l;i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}
	//从小到大排序,,
	public static void sort(int[] a){
		int l=a.length;
		Boolean isAlter = false;
		int temp=0,t2=0;
		for(int i=l;i>0;i--){//每轮得到一个最大值
			temp=i-1;
			isAlter=false;
			for(int j=0;j<temp;j++)
				if(a[j] > a[j+1]){//swap
					t2=a[j];
					a[j]=a[j+1];
					a[j+1]=t2;
					isAlter=true;
				}
			if(!isAlter)
				break;
		}
	}
}
