package singleton;

public class testLazy {
	public static void main(String[] args) {
		//����д��ȡ���Σ�������������
		SingletonLazy single = SingletonLazy.getInstance();
		SingletonLazy single2 = SingletonLazy.getInstance();
		//Singleton����ֻ����һ��
		single.show();
		single2.show();
		//��������ĵ�ַ��ͬ
		if (single == single2) {
			System.out.println("�ö�����ַ�����ʾ��ʽ:");
			System.out.println("singletong: " + single.toString());
			System.out.println("singletong2: " + single2.toString());
			
		}
	}
}
