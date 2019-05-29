package memento;

/**
 * �ͻ��� 2019��5��29��
 */
public class Client {
	public static void main(String[] args) {
		// ����һ��������
		Originator originator = new Originator();

		// ����һ��������
		CareTaker careTaker = new CareTaker();

		// �ı�״̬
		originator.setState("State #1");
		originator.setState("State #2");

		// ���浽����¼
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
