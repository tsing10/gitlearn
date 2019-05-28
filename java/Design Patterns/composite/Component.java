package composite;

import java.util.List;

/*
 * ���󹹼���ɫ��
 */
public abstract class Component {
	/**
     * ��ӡ������������
     * @param preStr ǰ׺������ʵ������
     */
	public abstract void printStruct(String preStr);
	/**
     * �ۼ�������������һ���ӹ�������
     * @param child �ӹ�������
     */
	public void addChild(Component child) {
		/**
         * ȱʡʵ�֣��׳��쳣����Ϊ��Ҷ����û�д˹���
         * ���������û��ʵ���������
         */
		throw new UnsupportedOperationException("����֧�ִ˹���");
		
	}
	/**
     * �ۼ���������ɾ��һ���ӹ�������
     * @param index �ӹ���������±�
     */
	public void removeChild(int index) {
		/**
         * ȱʡʵ�֣��׳��쳣����Ϊ��Ҷ����û�д˹���
         * ���������û��ʵ���������
         */
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
	   /**
     * �ۼ������������������ӹ�������
     * @return ���������ӹ�������
     */
	public List<Component> getChild(){
		/**
         * ȱʡʵ�֣��׳��쳣����Ϊ��Ҷ����û�д˹���
         * ���������û��ʵ���������
         */
		throw new UnsupportedOperationException("����֧�ִ˹���");
	
	}
}
