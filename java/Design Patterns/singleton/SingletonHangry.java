package singleton;

//饿汉式单例
//线程安全
//类初始化就new对象 占用内存 但是速度快
public class SingletonHangry {

	// 私有化构造方法
	private SingletonHangry() {
	};

	// 饿汉式单例类.在类初始化时，已经自行实例化
	private static final SingletonHangry singleton = new SingletonHangry();

	public static SingletonHangry getInstance() {
		return singleton;
	}

}
