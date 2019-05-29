package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * �����ߣ�������¼
 *
 * 2019��5��29��
 */
public class CareTaker {
	//���汸��¼
	private List<Memento> mementoLists = new ArrayList<Memento>();
	
	/**
	 * ��ӱ���������¼
	 * @param state
	 */
	public void add(Memento state) {
		mementoLists.add(state);
	}

	/**
	 * �ӱ���¼��ȡ����
	 * @param index
	 * @return
	 */
	public Memento getMemento(int index) {
		return mementoLists.get(index);
	}
}
