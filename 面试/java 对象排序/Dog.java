package mianshi;

/**
 * С����
 * @author JiaJiCheng
 *
 */
public class Dog {
 
	// ����
	private String name;
	
	// ����
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