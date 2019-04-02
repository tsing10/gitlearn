package paixu;

import java.util.Arrays;

public class SelectSort {
	public static void selectSort(int[] x) {
		if (x.length != 0) {
			int temp = 0;
			for (int i = 0; i < x.length; i++) {
				int min = i;
				for (int j = i; j < x.length; j++) {
					if (x[j] < x[min]) {
						min = j;
					}
				}
				temp = x[min];
				x[min] = x[i];
				x[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 2, 4, 9, 6, 8, 7 };
		System.out.print("原始数组是：");
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.print("排序之后的数组是：");
		System.out.println(Arrays.toString(arr));
	}
}
