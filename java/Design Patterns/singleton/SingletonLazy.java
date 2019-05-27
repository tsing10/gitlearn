package singleton;
/**
 * �̲߳���ȫ
 * ��Ҫ�� ͬ��������̬�ڲ����
 * @author yangshanqing
 *
 * 2019��5��27��
 */
public class SingletonLazy {
	//˽�л����캯�� ��ֹ�ⲿ����
	private SingletonLazy() {}
	public static SingletonLazy single = null;
	//����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ� 
	public static SingletonLazy getInstance() {
		if(single == null) {
			single = new SingletonLazy();
			System.out.println("����һ��!");					
		}
		return single;
	}
	public void show() {
		System.out.println("���� show ");
	}
}
