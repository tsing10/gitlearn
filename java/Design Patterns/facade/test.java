package facade;

/**
 * 外观模式
 * 以后把大象装进冰箱不用再一步一步的来，直接调用Facade的方法，即可一步到位，麻麻再也不用担心步骤不对了~
 * 
 * @author yangshanqing
 *
 *         2019年5月27日
 */

public class test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.Elephant2Refrigerator();
	}
}
