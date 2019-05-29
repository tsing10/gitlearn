package memento;
/**
 * 
 * 备忘录类
 * 2019年5月29日
 */
public class Memento {
	/**
	 *需要备份的相关数据 
	 */
	private String state;
	/**
	 * 构造函数 创建备忘录时将相关数据导入
	 * @param state1
	 * @param state2
	 */
	public Memento(String state) {
		this.state = state;
	}
	/**
	 * 取出备忘录中的数据
	 * @return state
	 */
	public String getState() {
		return state;
	}
}
