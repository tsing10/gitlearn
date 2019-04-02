package mianshi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class queryIntArray4int {
	/**
	 * 	这是 unity公司的面试题 
	 *	给定一个一维数组 数组内含有严格单调递增的int型整值 给定一个int整数 
	 * 	编写方法 
	 * 		参数是上述给定的数组和整数
	 * 		返回数组中两两之和为给定整数的两两之和的位置
	 */
	static Map<Integer,Integer> sumAddr(int[] arr, int tar){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //用于存储获取到的下标
		for(int i =0;i<arr.length-1;i++){
			int tarminus = tar - arr[i];
			for(int j=i+1;j<arr.length;j++) { //j=i+1 此处就是用到了 严格递增
				if(arr[j] == tarminus) {
					map.put(i, j);
				}
			}
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,7,8};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer tar = 8;
		map = sumAddr(arr,tar);
		Iterator<Map.Entry<Integer, Integer>> ite = map.entrySet().iterator();
		System.out.print("数组 "+Arrays.toString(arr)+"中");
		System.out.println("两两求和为"+tar+"的数组元素的下标为：");
		while(ite.hasNext()) {
			Map.Entry<Integer, Integer> entry = ite.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
