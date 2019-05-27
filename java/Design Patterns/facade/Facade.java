package facade;

public class Facade {
	// 被委托的对象(子系统)
	private Open open = new Open();
	private Pack pack = new Pack();
	private Close close = new Close();

	// 提供给外部访问的方法
	public void Elephant2Refrigerator() {
		this.open.open();
		this.pack.pack();
		this.close.close();
	}
}
