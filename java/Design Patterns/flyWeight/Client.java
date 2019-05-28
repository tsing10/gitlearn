package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * FlyWeight原型
 *
 * 2019年5月28日
 */

abstract class FlyWeight{
	public abstract void operation(int state);
}

class ConcreteFlyWeight extends FlyWeight{

	@Override
	public void operation(int state) {
		System.out.println("Concrete FlyWeight Information: "+state);
	}
}

class FlyWeightFactory{
	private Map<String, FlyWeight> flyWeightMap = new HashMap<String, FlyWeight>();
	public void FlyweightFactory() {
		//init 3 objects
		flyWeightMap.put("x", new ConcreteFlyWeight());
		flyWeightMap.put("x", new ConcreteFlyWeight());
		flyWeightMap.put("y", new ConcreteFlyWeight());
	}
	
	public FlyWeight getFlyWeight(String key) {
		//当客户端要求生成一个对象时，工厂会检测是否存在此对象的实例，如果存在那么直接返回此对象实例，
		//如果不存在就创建一个并保存起来，这点有些单例模式的意思。
		FlyWeight flyWeight = flyWeightMap.get(key);
		if(null == flyWeight) {
			flyWeight = new ConcreteFlyWeight();
			flyWeightMap.put(key, flyWeight);
		}
		return flyWeight;
	}
}
 
public class Client {
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight flyWeightx = factory.getFlyWeight("x");
		flyWeightx.operation(2);
		
	}
}
