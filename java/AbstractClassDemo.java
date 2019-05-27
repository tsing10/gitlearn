package tsing;

/**
 * 
 * @author tsing
 *	验证抽象类内部可以有同时有 
 *	1 具体的方法：包含方法的实现  
 *	2 抽象的方法：不包含方法体
 */
abstract class AbsD {
	
	public void fuc() {
		System.out.println("抽象类内部的方法实现");
	}
	public void fuc2() {}
}

public class AbstractClassDemo extends AbsD{
	@Override
	public void fuc2() {
		System.out.println("抽象类子类的方法实现");
	}
	public static void main(String[] args) {
		System.out.println("-------------------");
		AbstractClassDemo a = new AbstractClassDemo();
		a.fuc();
		a.fuc2();
		System.out.println("-------------------");		
		
	}
}
