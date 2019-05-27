package observeDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲��ߣ�Ҳ����΢�Ź��ںŷ��� ʵ����Observerable�ӿڣ���Observerable�ӿڵ��������������˾���ʵ��
 * 
 * @author yangshanqing
 *
 *         2019��5��26��
 */

public class WechatServer implements Observerable {

	private List<Observer> list;
	private String message;

	public WechatServer() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if (!list.isEmpty()) {
			list.remove(o);
		}
	}

	// ����
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}

	public void setInfo(String info) {
		this.message = info;
		System.out.println("΢�ŷ��������Ϣ�� " + info);
		notifyObserver();
	}

}
