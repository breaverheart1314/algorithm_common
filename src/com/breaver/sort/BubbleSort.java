/**
 * 
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017��6��20�� ����6:30:24
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static <T>T[] funtion(T t[]){
		//������ô��
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
	//��С��������,,
	public static void sort(int[] a){
		int l=a.length;
		Boolean isAlter = false;
		int temp=0,t2=0;
		for(int i=l;i>0;i--){//ÿ�ֵõ�һ�����ֵ
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
