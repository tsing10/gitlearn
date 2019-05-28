package factoryMethod;

public class BmwDirver implements Driver{

	@Override
	public Car dirverCar() {
		return new  Bmw();
	}

}
