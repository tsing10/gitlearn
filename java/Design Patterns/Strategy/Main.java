package Strategy;

/**
 * StrategyģʽҲ�в���ģʽ����Ϊģʽ֮һ������һϵ�е��㷨���Է�װ��Ϊ�����㷨����һ��������㷨�ӿڣ�
 * ��ͨ���̳иó����㷨�ӿڶ����е��㷨���Է�װ��ʵ�֣�������㷨ѡ���ɿͻ��˾��������ԣ��� 
 * Strategyģʽ��Ҫ����ƽ���ش����㷨���л� ��
 *
 * 2019��5��26��
 */

public class Main {
	public static void main(String[] args) {
//		Strategy mD5Strategy = new MD5Strategy();
		Strategy SHA1Strategy = new SHA1Strategy();
//		Context context = new Context(mD5Strategy);
		Context context = new Context(SHA1Strategy);
		context.encrypy();
	}
}
