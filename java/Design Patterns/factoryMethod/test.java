package factoryMethod;

public class test {
	public static void main(String[] args) {
		try {
			Driver driver = new BenzDriver();
			Car car = driver.dirverCar();
			car.drive();
		} catch (Exception e) {
			
		}
	}
}
