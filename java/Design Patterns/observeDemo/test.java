package observeDemo;

public class test {
	
	public static void main(String[] args) {
		WechatServer server = new WechatServer();
		
		Observer userZhang =  new User("ZhangWu");
		
		Observer userLi = new User("LiSi");
		
		Observer UserWang = new User("WangWu");
		
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(UserWang);
		server.setInfo("PHP������������õ����ԣ�");
		
		System.out.println("------------------------------");
		server.removeObserver(userZhang);
		server.setInfo("JAVA����������õ����ԣ�");
	}

}
