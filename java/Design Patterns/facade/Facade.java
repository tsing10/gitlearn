package facade;

public class Facade {
	// ��ί�еĶ���(��ϵͳ)
	private Open open = new Open();
	private Pack pack = new Pack();
	private Close close = new Close();

	// �ṩ���ⲿ���ʵķ���
	public void Elephant2Refrigerator() {
		this.open.open();
		this.pack.pack();
		this.close.close();
	}
}
