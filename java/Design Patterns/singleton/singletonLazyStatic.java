package singleton;
/*
 * 静态内部类解决懒加载线程安全问题
 */
public class singletonLazyStatic {
		//私有化构造函数 防止外部构造
		private singletonLazyStatic() {}
		public static singletonLazyStatic single = null;
		//静态初始化器 由JVM保证线程安全
		private static class PersonHolder{
			private static singletonLazyStatic instance = new singletonLazyStatic();
		}
		//懒汉式单例类.在第一次调用的时候实例化自己 
		public static singletonLazyStatic getInstance() {
			return PersonHolder.instance;
		}
		public void show() {
			System.out.println("我是 show ");
		}
}
/**
 *静态有一些特点：

1.全局唯一，任何一次的修改都是全局性的影响

2.只加载一次，优先于非静态

3.使用方式上不依赖于实例对象。

4.生命周期属于类级别，从JVM 加载开始到JVM卸载结束。 
  */
