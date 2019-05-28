package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * FlyWeightԭ��
 *
 * 2019��5��28��
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
		//���ͻ���Ҫ������һ������ʱ�����������Ƿ���ڴ˶����ʵ�������������ôֱ�ӷ��ش˶���ʵ����
		//��������ھʹ���һ�������������������Щ����ģʽ����˼��
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
