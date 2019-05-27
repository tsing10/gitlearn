package observeDemo;

/**
 * 观察者
 * 实现了update()
 * @author yangshanqing
 *
 * 2019年5月26日
 */
public class User implements Observer {
	private String name;
	private String message;
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		read();
	}
	
	public void read() {
		System.out.println(name + "收到的推送消息：" + message);
	}
	
}
