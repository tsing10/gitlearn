package decorator;

//具体装饰类
public class RedDecorator extends HouseDecorator {

	public RedDecorator(House house) {
		// 调用父类的构造函数
		super(house);
	}

	public void style() {
		this.house.style();
		System.out.println("红色装饰墙");
	}
}
