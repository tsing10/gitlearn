package singleton;

public class testLazy {
	public static void main(String[] args) {
		//故意写获取两次，创建两个对象
		SingletonLazy single = SingletonLazy.getInstance();
		SingletonLazy single2 = SingletonLazy.getInstance();
		//Singleton对象只创建一次
		single.show();
		single2.show();
		//两个对象的地址相同
		if (single == single2) {
			System.out.println("该对象的字符串表示形式:");
			System.out.println("singletong: " + single.toString());
			System.out.println("singletong2: " + single2.toString());
			
		}
	}
}
