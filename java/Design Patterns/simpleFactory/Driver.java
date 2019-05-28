package simpleFactory;
/**
 * 
 * https://cloud.tencent.com/developer/article/1342486
 * 2019��5��28��
 */
//�������ɫ 
public class Driver {

	//�������� 
	//ע�� ��������Ϊ�����Ʒ��ɫ 
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
