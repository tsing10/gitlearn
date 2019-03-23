package threadDemo;

public class Thread2Runnable implements Runnable{
	private String name;

	public Thread2Runnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++) {
			System.out.println(name + " running, i " + i);
		}
	}
}
class runnableDemo01{
	public static void main(String[] args) {
		Thread2Runnable tr1= new Thread2Runnable("thread1");
		Thread2Runnable tr2= new Thread2Runnable("thread2");
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		t1.start();
		t2.start();
	}
}