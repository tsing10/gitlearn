package tsing;

/**
 * 
 * @author tsing
 *	��֤�������ڲ�������ͬʱ�� 
 *	1 ����ķ���������������ʵ��  
 *	2 ����ķ�����������������
 */
abstract class AbsD {
	
	public void fuc() {
		System.out.println("�������ڲ��ķ���ʵ��");
	}
	public void fuc2() {}
}

public class AbstractClassDemo extends AbsD{
	@Override
	public void fuc2() {
		System.out.println("����������ķ���ʵ��");
	}
	public static void main(String[] args) {
		System.out.println("-------------------");
		AbstractClassDemo a = new AbstractClassDemo();
		a.fuc();
		a.fuc2();
		System.out.println("-------------------");		
		
	}
}
