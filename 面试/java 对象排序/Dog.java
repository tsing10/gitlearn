package mianshi;

/**
 * 小狗类
 * @author JiaJiCheng
 *
 */
public class Dog {
 
	// 姓名
	private String name;
	
	// 年龄
	private int age;
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "I'm " + name + " about " + age + " years old. ";
	}

}