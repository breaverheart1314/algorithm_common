/**-------------error-----------
 * 快速排序由C. A. R. Hoare在1962年提出。
 * 它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017年6月20日 下午6:59:29
 */
public class QuicklySort {

	/**用递归
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int l=BubbleSort.a.length;
		BubbleSort.print(BubbleSort.a);
		QuicklySort.sort(BubbleSort.a,
				BubbleSort.a.length,
				0);
		BubbleSort.print(BubbleSort.a);
	}
	//从小到大
	public static void sort(int a[],int length,int start){
		int leftOfCenter,rightOfCenter;
		//选取左边第一个为起始点
		int centerPosition=a[start];
		leftOfCenter=start+1;
		rightOfCenter=start+length-1;
		int emptyPosition=start;
		int temp;
		while(leftOfCenter!=rightOfCenter){
			if(a[leftOfCenter]<a[centerPosition]){
				//左点小于中点，就只需要左加1
//				a[emptyPosition] = a[leftOfCenter];
//				emptyPosition=leftOfCenter;
			}else if(a[leftOfCenter] > a[centerPosition]){
				//左大于中，从右边找来换-------------
				while(leftOfCenter<rightOfCenter){
					if(a[rightOfCenter] < a[leftOfCenter]){
						break;
					}
					rightOfCenter--;
				}
				if(leftOfCenter == rightOfCenter)
					break;
				temp = a[leftOfCenter];
				a[leftOfCenter]=a[rightOfCenter];
				a[rightOfCenter]=temp;
			}
			leftOfCenter++;
		}
//		a[emptyPosition]=centerPosition;
		a[emptyPosition]=111111;
	}
}
