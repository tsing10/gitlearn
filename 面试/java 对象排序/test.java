package mianshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
	
	
	public static void main(String[] args) {
		// 构造几个dog对象
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
 
		dog1.setName("旺财");
		dog1.setAge(4);
 
		dog2.setName("小花");
		dog2.setAge(2);
 
		dog3.setAge(3);
		dog3.setName("小白");
 
		dog4.setAge(8);
		dog4.setName("小虎");
 
		// 把对象装入list
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
 
		//Collections.sort(list, c);
		// 对对象安装年龄从小到大排序
		Collections.sort(dogList, new Comparator<Dog>() {
 
			@Override
			public int compare(Dog o1, Dog o2) {
				int first = o1.getAge();
				int second = o2.getAge();
				if (first > second) {   // first > second return 1 表示按照从小到大排序
					return 1;
				} else if (first == second) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		for (Dog dog : dogList) {
			System.out.println(dog.toString());
		}
		
		
 
	}
}
