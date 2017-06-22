/**
 * ѡ������Selection sort����һ�ּ�ֱ�۵������㷨��
 * ���Ĺ���ԭ����ÿһ�δӴ����������Ԫ����ѡ����С������󣩵�һ��Ԫ�أ�
 * ��������е���ʼλ�ã�ֱ��ȫ�������������Ԫ�����ꡣ
 *  ѡ�������ǲ��ȶ������򷽷�����������[5�� 5�� 3]��һ�ξͽ���һ��[5]��[3]������
 *  ���µ�һ��5Ų�����ڶ���5���棩��
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017��6��21�� ����10:29:48
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
