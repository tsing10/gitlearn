package decorator;

//����װ����
public class RedDecorator extends HouseDecorator {

	public RedDecorator(House house) {
		// ���ø���Ĺ��캯��
		super(house);
	}

	public void style() {
		this.house.style();
		System.out.println("��ɫװ��ǽ");
	}
}
