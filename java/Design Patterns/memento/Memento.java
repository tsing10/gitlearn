package memento;
/**
 * 
 * ����¼��
 * 2019��5��29��
 */
public class Memento {
	/**
	 *��Ҫ���ݵ�������� 
	 */
	private String state;
	/**
	 * ���캯�� ��������¼ʱ��������ݵ���
	 * @param state1
	 * @param state2
	 */
	public Memento(String state) {
		this.state = state;
	}
	/**
	 * ȡ������¼�е�����
	 * @return state
	 */
	public String getState() {
		return state;
	}
}
