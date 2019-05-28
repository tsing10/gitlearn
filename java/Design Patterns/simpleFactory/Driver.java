package simpleFactory;
/**
 * 
 * https://cloud.tencent.com/developer/article/1342486
 * 2019年5月28日
 */
//工厂类角色 
public class Driver {

	//工厂方法 
	//注意 返回类型为抽象产品角色 
	public static Car driveCar(String str) throws Exception {
		if("Benz".equalsIgnoreCase(str)) {
			return new Benz();
		}else if("Bmw".equalsIgnoreCase(str)) {
			return new Bmw();
		}else if("Audi".equalsIgnoreCase(str)){
			return new Audi();
		}else {
			throw new Exception();
		}
	}
	
}
