package threadDemo;
/**
 * 
 * @author tsing
 *   —È÷§Interrupt
 *   2019/3/23
 */
class Thread2Runnable4 implements Runnable{
	private String name;

	public Thread2Runnable4(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1. enter run()");
		try {
			Thread.sleep(10000);
			System.out.println("2. end of sleep() ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("3. sleep by interrupt ");
			return;
		}
		System.out.println("4. end of run()");
	}
}
public class Thread2Interrupt {
	public static void main(String[] args) {
		Thread2Runnable4 tr = new Thread2Runnable4("thread A");
		Thread t= new Thread(tr);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("3. sleep by interrupt ");
		}
		t.interrupt();
	}

}
