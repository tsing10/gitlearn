package proxyDemo;

/**
 * 
 * @author yangshanqing
 *
 * 2019年3月27日
 * 
 * 静态代理

我们平常去电影院看电影的时候，在电影开始的阶段是不是经常会放广告呢？

电影是电影公司委托给影院进行播放的，但是影院可以在播放电影的时候，产生一些自己的经济收益，比如卖爆米花、可乐等，然后在影片开始结束时播放一些广告。

现在用代码来进行模拟。
 */

/**
 * 
 * 首先得有一个接口，通用的接口是代理模式实现的基础。这个接口我们命名为 Movie，代表电影播放的能力。 电影接口
 */
interface Movie {
	void play();
}

/**
 * 然后，我们要有一个真正的实现这个 Movie 接口的类，和一个只是实现接口的代理类。 RealMovie表示真正的影片。它实现了 Movie
 * 接口，play() 方法调用时，影片就开始播放。那么 Proxy 代理呢？
 */
class RealMovie implements Movie {

	@Override
	public void play() {
		System.out.println("您正在观看电影 《肖申克的救赎》");
	}
}

/**
 * Cinema电影院 就是 Proxy 代理对象，它有一个 play() 方法。不过调用 play()
 * 方法时，它进行了一些相关利益的处理，那就是广告。现在，我们编写测试代码。
 */
class Cinema implements Movie {
	RealMovie rm = new RealMovie(); // 将被代理类包含在代理体内

	public Cinema(RealMovie movie) {
		super(); // ????作用是：
		this.rm = movie;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		guanggao(true);
		rm.play();
		guanggao(false);
	}

	void guanggao(boolean isStart) {
		if (isStart) {
			System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
		} else {
			System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
		}
	}

}

/**
 * 测试静态代理类
 */
public class StaticProxyTest {
	public static void main(String[] args) {
		RealMovie rm = new RealMovie();
		Movie movie = new Cinema(rm); // 接口可以接收实现该接口的类的对象
		movie.play();
	}
}
