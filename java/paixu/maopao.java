package paixu;

import java.util.Arrays;

public class maopao {
	public static void main(String[] args) {
		int[] arr = {6,3,2,1,7,8,9,4,7,8,9}; 
		System.out.println("排序前: "+Arrays.toString(arr));
		boolean isSwap = false; //如果一次循环没有交换 就是false 退出
        for(int i = 0;i<arr.length-1;i++){//外层循环n-1
            for(int j = 0;j<arr.length-i-1;j++){//内层循环n-i-1
                if(arr[j]>arr[j+1]){//从第一个开始，往后两两比较大小，如果前面的比后面的大，交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isSwap = true;
                }   
            }
            if(!isSwap) {
            	break;
            }
        }
        System.out.println("排序后: "+Arrays.toString(arr));
    }
}
