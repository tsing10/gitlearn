package JDKProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author yangshanqing
 *
 * 2019年3月27日
 * 动态代理中，我们可以让程序在运行的时候自动在内存中创建一个实现接口的代理
 */
/**
 * SellWine 是一个接口，你可以理解它为卖酒的许可证。
 */
interface SellWine{
	void maijiu();
}
/**
 * 然后创建一个类 MaotaiJiu,对的，就是茅台酒的意思。
 */
class MaotaiJiu implements SellWine{

	@Override
	public void maijiu() {
		System.out.println("我卖的是茅台酒。");
	}
}
/**
 * 再创建一个类Wuliangye,对的，就是五粮液的意思。
 */
class Wuliangye implements SellWine{

	@Override
	public void maijiu() {
		System.out.println("我卖的是五粮液。");
	}	
}
/**
 * 我们还需要一个柜台来卖酒或烟：
 */
class Guitai implements InvocationHandler {
	
	Object pinpai;
	public Guitai(Object pinpai) {//因为是object 所以可以接收所有类型的接口实现类
		this.pinpai = pinpai;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("销售开始  柜台是： "+this.getClass().getSimpleName());
		method.invoke(pinpai, args);
		System.out.println("销售结束");
		return null;
	}	
}

/**
 * 然后，我们就可以卖酒了。
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		MaotaiJiu mt = new MaotaiJiu(); //接口的实现类
		Wuliangye wly = new Wuliangye();
		Liqun lq = new Liqun(); 
		InvocationHandler jingxiao1 = new Guitai(mt); //注入依赖 的对象
		InvocationHandler jingxiao2 = new Guitai(wly);
		InvocationHandler jingxiao3 = new Guitai(lq);
		/**
		 * 通过 Proxy 的静态方法 newProxyInstance 才会动态创建代理。
		 * 		3个参数
		 * 1 loader 自然是类加载器
		 * 2 interfaces 代码要用来代理的接口
		 * 3 一个 InvocationHandler 对象 （注入）
		 */
		SellWine sw1 = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
				MaotaiJiu.class.getInterfaces(), jingxiao1);
		SellWine sw2 = (SellWine) Proxy.newProxyInstance(Wuliangye.class.getClassLoader(),
				Wuliangye.class.getInterfaces(), jingxiao2);
		SellCigarette sc =(SellCigarette) Proxy.newProxyInstance(Liqun.class.getClassLoader(),
				Liqun.class.getInterfaces(), jingxiao3);
		sw1.maijiu();
		sw2.maijiu();
		sc.maiyan();
	}
}
