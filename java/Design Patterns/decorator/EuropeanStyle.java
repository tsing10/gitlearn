package decorator;

//具体组件
public class EuropeanStyle implements House {

	@Override
	public void style() {
		System.out.println("欧式风格装修");
	}

}
