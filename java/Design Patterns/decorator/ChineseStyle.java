package decorator;

//具体组件
public class ChineseStyle implements House {

	@Override
	public void style() {
		System.out.println("中式风格装修");
	}
}
