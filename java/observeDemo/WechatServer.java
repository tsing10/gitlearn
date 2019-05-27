package observeDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 
 * @author yangshanqing
 *
 *         2019年5月26日
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

	// 遍历
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
		System.out.println("微信服务更新消息： " + info);
		notifyObserver();
	}

}
