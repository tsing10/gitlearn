package protoType;

public class test {
	public static void main(String[] args) {
		Person p1 = new  Person();
		//对象拷贝时，类的构造函数是不会被执行的
		Person p2 = p1.clone();
	}
}
