package SpringAOP.aspectDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 	利用Java的Stack实现括号匹配，包括是否成对出现以及是否正确嵌套。
 * 	例如：( ) , { } , [ ] , ( { } [ ] )为正确嵌套，) } , ( { ) } , ( { [ } ] )为非正确嵌套。
 * @author yangshanqing
 *
 * 2019年3月28日
 */
public class MacthChar {
	public static void main(String[] args) {
		String s = new String("([]{})"); 
		System.out.println(isT(s));
	}
	/**
	 * 	
	 * 验证括号是否匹配
	 * @param str：存储括号字符串，没有验证字符串的合法性
	 * @return 匹配返回true 不匹配返回false
	 */
	
	static boolean isT(String str) {
//		首先：字符([]{} 无法用 == 和equals 判断是否匹配 所以引入 hashmap，字符作为key int作为value
//		匹配的字符之间 value之和为0
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('(',1);
		hm.put(')',-1);
		hm.put('{',2);
		hm.put('}',-2);
		hm.put('[',3);
		hm.put(']',-3);
		Stack<Integer> sta = new Stack<Integer>();
		//首先将第一个字符的key压入栈
		sta.push(hm.get(str.charAt(0)));
		for (int i = 1; i < str.toCharArray().length ; i++) {
			
			/*
			 *	 如果栈非空 比较栈内元素的key与str[i]的key是否相加为0 
			 *	0是就匹配 出栈 i++
			 *	1是不匹配 str[i] 入栈
			 */
			if(!sta.isEmpty()) {
				if( hm.get(str.charAt(i)) + sta.peek() != 0) {
					sta.push(hm.get(str.charAt(i)));
				}else {
					sta.pop();
				}
			}else {//如果栈为空 直接入栈
				sta.push(hm.get(str.charAt(i)));
			}
		}
		/*
		 * 	完成栈操作，
		 *	如果栈空 说明匹配正确 返回true 
		 * 	否则 匹配不正确 返回false
		 */
		if(sta.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}

