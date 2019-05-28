package factoryMethod;

public class BenzDriver implements Driver{

	@Override
	public Car dirverCar() {
		return new Benz();
	}
}
