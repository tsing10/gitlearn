package memento;
/**
 * 发起人
 * 2019年5月29日
 */
public class Originator {
	/**
	 *需要备份的相关数据 
	 */
	private String state;
	/**
	 * 创建备忘录，将当前需要保存的数据导入并创建一个备忘录对象
	 * @return
	 */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	/**
	 * 将备忘录导入并恢复数据
	 * @param memento
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
	/**
	 * 显示当前备忘录数据
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
