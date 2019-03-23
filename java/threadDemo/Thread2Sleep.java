package threadDemo;

/**
 * 
 * 
 * @author tsing
 *—È÷§sleep
 *2019/3/23
 */
class Thread2Runnable3 implements Runnable{
	private String name;

	public Thread2Runnable3(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
			System.out.println(Thread.currentThread().getName() + " running, i = " + i);
		}
	}
}
public class Thread2Sleep {
	public static void main(String[] args) {
		Thread2Runnable3 tr = new Thread2Runnable3("thread A");
		Thread t = new Thread(tr);
		t.start();
	}
}
