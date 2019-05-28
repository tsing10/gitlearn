package simpleFactory;

//欢迎暴发户出场...... 
public class test {

	public static void main(String[] args) {
		try {//告诉司机我今天坐奔驰 
			Car car = Driver.driveCar("Benz");
			//下命令：开车 
			car.drive();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
