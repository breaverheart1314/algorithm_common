/**
 * 左右两边，选左第一个为基准，游标选第二个开始，右边
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017年6月21日 上午9:16:12
 */
public class QuicklySort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(arg0);
		BubbleSort.print(BubbleSort.a);
		QuicklySort1.sort(BubbleSort.a, 0, BubbleSort.a.length-1);
		BubbleSort.print(BubbleSort.a);
	}
	//没有指针------
	public static void sort(int []a,int leftIndex,int rightIndex){
		int i = leftIndex+1;
		int val_base=a[leftIndex];
		int val_temp;
		int start_l=leftIndex,start_r=rightIndex;
		while(i!=rightIndex){
			if(a[i] < val_base){
				i++;
				continue;
			}
			else if(a[i] == val_base){
				i++;
				continue;
			}
			else{
				while(rightIndex!=i){
					if(a[rightIndex]<val_base){
						break;
					}
					else{
						rightIndex--;
					}
				}
				if(rightIndex == i){//这个大于基值要左移动
					i--;//
					break;
				}
				val_temp=a[rightIndex];
				a[rightIndex]=a[i];
				a[i]=val_temp;
				i++;
			}
		}
//		i--;
		if(a[i] > val_base)
			i--;
		val_temp=a[i];
		a[i]=a[leftIndex];
		a[leftIndex]=val_temp;
		//-----------child-----------method--------
		//left
		if(start_l+1 == start_r)
			return;
		if(i-1 > start_l)
		sort(a,start_l,i-1);
		if(i+1 < start_r)
		sort(a,i+1,start_r);
	}
}
