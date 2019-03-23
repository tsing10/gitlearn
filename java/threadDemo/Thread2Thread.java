package threadDemo;

public class Thread2Thread extends Thread{
	private String name;

	public Thread2Thread(String name) {
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

class  ThreadDemo2{
	public static void main(String[] args) {
		Thread2Thread tr1= new Thread2Thread("thread1");
		Thread2Thread tr2= new Thread2Thread("thread2");
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		t1.start();
		t2.start();
	}
}
