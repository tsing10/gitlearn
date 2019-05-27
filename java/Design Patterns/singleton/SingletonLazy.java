package singleton;
/**
 * 线程不安全
 * 需要加 同步锁，静态内部类等
 * @author yangshanqing
 *
 * 2019年5月27日
 */
public class SingletonLazy {
	//私有化构造函数 防止外部构造
	private SingletonLazy() {}
	public static SingletonLazy single = null;
	//懒汉式单例类.在第一次调用的时候实例化自己 
	public static SingletonLazy getInstance() {
		if(single == null) {
			single = new SingletonLazy();
			System.out.println("创建一次!");					
		}
		return single;
	}
	public void show() {
		System.out.println("我是 show ");
	}
}
