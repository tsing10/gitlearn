package memento;
/**
 * ������
 * 2019��5��29��
 */
public class Originator {
	/**
	 *��Ҫ���ݵ�������� 
	 */
	private String state;
	/**
	 * ��������¼������ǰ��Ҫ��������ݵ��벢����һ������¼����
	 * @return
	 */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	/**
	 * ������¼���벢�ָ�����
	 * @param memento
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
	/**
	 * ��ʾ��ǰ����¼����
	 */
	public void show() {
		System.out.println("state: " + state);
	}
	
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	
	
	
}
