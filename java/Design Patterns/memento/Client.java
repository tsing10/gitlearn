package memento;

/**
 * 客户端 2019年5月29日
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个发起人
		Originator originator = new Originator();

		// 创建一个管理者
		CareTaker careTaker = new CareTaker();

		// 改变状态
		originator.setState("State #1");
		originator.setState("State #2");

		// 保存到备忘录
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");
		careTaker.add(originator.saveStateToMemento());
		// originator.show();

		System.out.println("current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.getMemento(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.getMemento(1));
		System.out.println("scecond saved state: " + originator.getState());
	}
}
