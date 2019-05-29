package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 管理者，管理备忘录
 *
 * 2019年5月29日
 */
public class CareTaker {
	//保存备忘录
	private List<Memento> mementoLists = new ArrayList<Memento>();
	
	/**
	 * 添加备忘到备忘录
	 * @param state
	 */
	public void add(Memento state) {
		mementoLists.add(state);
	}

	/**
	 * 从备忘录中取备忘
	 * @param index
	 * @return
	 */
	public Memento getMemento(int index) {
		return mementoLists.get(index);
	}
}
