package composite;

public class Leaf extends Component {
	/**
	 * ��϶��������
	 */
	private String name;

	/**
	 * ���췽����������϶��������
	 * 
	 * @param name ��϶��������
	 */
	public Leaf(String name) {
		this.name = name;

	}

	/**
	 * ���Ҷ�Ӷ�����ΪҶ�Ӷ���û���ֶ���Ҳ�������Ҷ�Ӷ�������ơ�
	 * 
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶����ƴ�ӵĿո�����ʵ���������
	 */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "+" + name);
	}

}
