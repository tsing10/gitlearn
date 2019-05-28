package JDKProxyDemo;

/**
 * 
 * @author yangshanqing
 *
 * 2019年3月27日
 * 重新定义一个 卖烟的接口SellCigarette 和 卖烟的实现类Liqun
 * 验证 动态接口的性能
 */
interface SellCigarette {
	void maiyan();
}

public class Liqun implements SellCigarette{

	@Override
	public void maiyan() {
		System.out.println("售卖的是正宗的利群，可以扫描条形码查证。");
	}
}



