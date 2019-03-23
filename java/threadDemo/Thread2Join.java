package threadDemo;

/**
 * 
 * @author tsing
 *使用join让一个线程强制运行 运行期间 其他线程等待此线程运行完成才能运行
 *2019/3/23
 */
class Thread2Runnable2 implements Runnable{
	private String name;

	public Thread2Runnable2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<100;i++) {
			System.out.println(Thread.currentThread().getName() + " running, i = " + i);
		}
	}
}
public class Thread2Join {
	public static void main(String[] args) {
		Thread2Runnable2 tr = new Thread2Runnable2("threadA");
		Thread t = new Thread(tr,"thread");
		t.start();
		for(int i = 0; i < 50; i++) {
			if(i > 10) {
				try {
					t.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("Main thread running -->" + i);
		}
	}
}
