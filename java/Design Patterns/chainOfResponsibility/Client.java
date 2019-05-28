package chainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		//��װ������
		Handler h1 = new ProjectManager();
		Handler h2 = new DeptManager();
		Handler h3 = new GenaralManager();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		  // ��ʼ����
        String test1 = h1.handleFeeRquest("����", 300);
        System.out.println("test1 = " + test1);
        String test2 = h1.handleFeeRquest("����", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h1.handleFeeRquest("����", 700);
        System.out.println("test3 = " + test3);
        String test4 = h1.handleFeeRquest("����", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h1.handleFeeRquest("����", 1500);
        System.out.println("test5 = " + test5);
        String test6 = h1.handleFeeRquest("����", 1500);
        System.out.println("test6 = " + test6);
	}
}
