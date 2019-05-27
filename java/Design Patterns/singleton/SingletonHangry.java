package singleton;

//����ʽ����
//�̰߳�ȫ
//���ʼ����new���� ռ���ڴ� �����ٶȿ�
public class SingletonHangry {

	// ˽�л����췽��
	private SingletonHangry() {
	};

	// ����ʽ������.�����ʼ��ʱ���Ѿ�����ʵ����
	private static final SingletonHangry singleton = new SingletonHangry();

	public static SingletonHangry getInstance() {
		return singleton;
	}

}
