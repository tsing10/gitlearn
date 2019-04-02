package paixu;

public class daozhiString {
	 
	public static void main(String[] args) {
		String src = "128783$4756";
		String desc = reverseString(src);
		System.out.println("倒置前: "+src);
		System.out.println("倒置后: "+desc);
		//output
		//123$456
		//654$321
	}
	
	/**
	 * 倒置字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseString(String str)
	{
		char[] arr=str.toCharArray();
		int middle = arr.length>>1;//EQ length/2
		int limit = arr.length-1;
		for (int i = 0; i < middle; i++) {
			char tmp = arr[i];
			arr[i]=arr[limit-i];
			arr[limit-i]=tmp;
		}
		return new String(arr);
	}
}