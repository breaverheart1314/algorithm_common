/**-------------error-----------
 * ����������C. A. R. Hoare��1962�������
 * ���Ļ���˼���ǣ�ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�
 * ����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��Ȼ���ٰ��˷����������������ݷֱ���п�������
 * ����������̿��Եݹ���У��Դ˴ﵽ�������ݱ���������С�
 */
package com.breaver.sort;

/**
 * @author zzf
 *@date 2017��6��20�� ����6:59:29
 */
public class QuicklySort {

	/**�õݹ�
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
	//��С����
	public static void sort(int a[],int length,int start){
		int leftOfCenter,rightOfCenter;
		//ѡȡ��ߵ�һ��Ϊ��ʼ��
		int centerPosition=a[start];
		leftOfCenter=start+1;
		rightOfCenter=start+length-1;
		int emptyPosition=start;
		int temp;
		while(leftOfCenter!=rightOfCenter){
			if(a[leftOfCenter]<a[centerPosition]){
				//���С���е㣬��ֻ��Ҫ���1
//				a[emptyPosition] = a[leftOfCenter];
//				emptyPosition=leftOfCenter;
			}else if(a[leftOfCenter] > a[centerPosition]){
				//������У����ұ�������-------------
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
