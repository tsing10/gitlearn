package observeDemo;

/**
 * ���󱻹۲��߽ӿ�
 * ��������ӡ�ɾ����֪ͨ�۲��߷���
 * @author yangshanqing
 *
 * 2019��5��26��
 * 
 */

public interface Observerable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
