package factoryMethod;

public class AudiDirver implements Driver{

	@Override
	public Car dirverCar() {
		return new Audi();
	}

}
