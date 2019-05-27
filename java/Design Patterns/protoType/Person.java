package protoType;

import java.util.ArrayList;
import java.util.List;

// 1、如果要克隆就必须实现Cloneable接口
public class Person implements Cloneable{
	private String name;
	private String sex;
	private List<String> list;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	//可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
	/**
	 * 浅复制
	 */
//	@Override
//	protected Person clone() {
//		try {
//			return (Person) super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//			return null;
//		}	
//	}
	
	/**
	 * 深复制
	 */
	protected Person clone() {
		try {
			Person person = (Person) super.clone();
			List<String> newList = new ArrayList<>();
			for(String str : this.list) {
				newList.add(str);
			}
			person.setList(newList);
			return person;
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
