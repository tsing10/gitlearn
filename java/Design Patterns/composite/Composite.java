package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	/**
	 * �����洢�����а������ӹ�������
	 */
	private List<Component> childComponents = new ArrayList< >();
	/**
	 * ��϶��������
	 */
	private String name;

	/**
	 * ���췽����������϶��������
	 * 
	 * @param name ��϶��������
	 */
	public Composite(String name) {
		this.name = name;
	}

	/**
	 * �ۼ�������������һ���ӹ�������
	 * 
	 * @param child �ӹ�������
	 */
	public void addChild(Component child) {
		childComponents.add(child);
	}

	/**
	 * �ۼ���������ɾ��һ���ӹ�������
	 * 
	 * @param index �ӹ���������±�
	 */
	public void removeChild(int index) {
		childComponents.remove(index);
	}

	/**
	 * �ۼ������������������ӹ�������
	 * 
	 * @return ���������ӹ�������
	 */
	public List<Component> getChild() {
		return childComponents;
	}

	@Override
	public void printStruct(String preStr) {
		// �����������
		System.out.println(preStr + '+' + this.name);

		// ��������������������ô�������Щ���������
		if (this.childComponents != null) {
			// ���ǰ׺�ո񣬱�ʾ�������
			preStr += " ";
//			ѭ���ݹ����ÿ���Ӷ���
			for (Component component : childComponents) {
				component.printStruct(preStr);
			}
		}
	}

}
