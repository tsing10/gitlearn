package mianshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
	
	
	public static void main(String[] args) {
		// ���켸��dog����
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
 
		dog1.setName("����");
		dog1.setAge(4);
 
		dog2.setName("С��");
		dog2.setAge(2);
 
		dog3.setAge(3);
		dog3.setName("С��");
 
		dog4.setAge(8);
		dog4.setName("С��");
 
		// �Ѷ���װ��list
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
 
		//Collections.sort(list, c);
		// �Զ���װ�����С��������
		Collections.sort(dogList, new Comparator<Dog>() {
 
			@Override
			public int compare(Dog o1, Dog o2) {
				int first = o1.getAge();
				int second = o2.getAge();
				if (first > second) {   // first > second return 1 ��ʾ���մ�С��������
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
