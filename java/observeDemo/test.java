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
		server.setInfo("PHP是世界上最好用的语言！");
		
		System.out.println("------------------------------");
		server.removeObserver(userZhang);
		server.setInfo("JAVA是世界上最好的语言！");
	}

}
