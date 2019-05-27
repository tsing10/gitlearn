package Strategy;

/**
 * Strategy模式也叫策略模式是行为模式之一，它对一系列的算法加以封装，为所有算法定义一个抽象的算法接口，
 * 并通过继承该抽象算法接口对所有的算法加以封装和实现，具体的算法选择交由客户端决定（策略）。 
 * Strategy模式主要用来平滑地处理算法的切换 。
 *
 * 2019年5月26日
 */

public class Main {
	public static void main(String[] args) {
//		Strategy mD5Strategy = new MD5Strategy();
		Strategy SHA1Strategy = new SHA1Strategy();
//		Context context = new Context(mD5Strategy);
		Context context = new Context(SHA1Strategy);
		context.encrypy();
	}
}
