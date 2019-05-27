package decorator;

//����װ����
public class HouseDecorator implements House {

	public House house;

	public HouseDecorator(House house) {
		this.house = house;
	}

	@Override
	public void style() {
		house.style();
	}

}
