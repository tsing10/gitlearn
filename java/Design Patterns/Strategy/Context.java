package Strategy;

//��װ��:Ҳ�������ģ��Բ��Խ��ж��η�װ��Ŀ���Ǳ���߲�ģ��Բ��Ե�ֱ�ӵ��á�
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void encrypy() {
		this.strategy.encrypt();
	}
}
