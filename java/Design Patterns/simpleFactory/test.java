package simpleFactory;

//��ӭ����������...... 
public class test {

	public static void main(String[] args) {
		try {//����˾���ҽ��������� 
			Car car = Driver.driveCar("Benz");
			//��������� 
			car.drive();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
