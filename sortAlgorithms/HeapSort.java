package sortAlgorithms;


public class HeapSort implements SortAlgorithms {

	private void heap(int[] a, int i) {
		int temp = a[i], foo = (int) (0.5*(i-1));
		while(temp < a[foo]) {
			if(i == 0) break;
			a[i] = a[foo];
			i = foo;
			foo = (int) (0.5*(i-1));
		}
		a[i] = temp;
	}
	

	
	private int pop(int[] a, int size) {
		int result = a[0];
		a[0] = a[size-1];
		int i = 0, son = 1, temp = a[size-1];	//һ��ʼsonָ���������
		while(son < size) {
			if(son + 1 < size  && a[son+1] < a[son]) 	//����������������Һ��ӽ�С��sonָ���Һ���
				son++;
			if(a[son] > temp)	//���son��temp�󣬼�temp���������Ӷ�С���������κβ���
				break;
			a[i] = a[son];	//��������
			i = son;		
			son = 2*son + 1;
		}
		a[i] = temp;
		
		return result;
	}
	
	private void heapSort(int[] array) {
		int[] a = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			a[i] = array[i];
			heap(a, i);
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = pop(a, a.length-i);
		}
		
	}
	
	public void sort(int[] array) {
		heapSort(array);

	}

}






