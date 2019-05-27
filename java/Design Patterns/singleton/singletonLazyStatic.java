package singleton;
/*
 * ��̬�ڲ������������̰߳�ȫ����
 */
public class singletonLazyStatic {
		//˽�л����캯�� ��ֹ�ⲿ����
		private singletonLazyStatic() {}
		public static singletonLazyStatic single = null;
		//��̬��ʼ���� ��JVM��֤�̰߳�ȫ
		private static class PersonHolder{
			private static singletonLazyStatic instance = new singletonLazyStatic();
		}
		//����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ� 
		public static singletonLazyStatic getInstance() {
			return PersonHolder.instance;
		}
		public void show() {
			System.out.println("���� show ");
		}
}
/**
 *��̬��һЩ�ص㣺

1.ȫ��Ψһ���κ�һ�ε��޸Ķ���ȫ���Ե�Ӱ��

2.ֻ����һ�Σ������ڷǾ�̬

3.ʹ�÷�ʽ�ϲ�������ʵ������

4.�������������༶�𣬴�JVM ���ؿ�ʼ��JVMж�ؽ����� 
  */
