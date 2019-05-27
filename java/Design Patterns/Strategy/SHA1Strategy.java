package Strategy;

//具体策略: 具体策略角色通常由一组封装了算法的类来担任，这些类之间可以根据需要自由替换。
public class SHA1Strategy implements Strategy {

	@Override
	public void encrypt() {
		// TODO Auto-generated method stub
		System.out.println("执行SHA1加密！");
	}

}
