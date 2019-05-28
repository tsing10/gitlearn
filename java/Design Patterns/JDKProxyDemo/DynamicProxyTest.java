package JDKProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author yangshanqing
 *
 * 2019��3��27��
 * ��̬�����У����ǿ����ó��������е�ʱ���Զ����ڴ��д���һ��ʵ�ֽӿڵĴ���
 */
/**
 * SellWine ��һ���ӿڣ�����������Ϊ���Ƶ����֤��
 */
interface SellWine{
	void maijiu();
}
/**
 * Ȼ�󴴽�һ���� MaotaiJiu,�Եģ�����ę́�Ƶ���˼��
 */
class MaotaiJiu implements SellWine{

	@Override
	public void maijiu() {
		System.out.println("��������ę́�ơ�");
	}
}
/**
 * �ٴ���һ����Wuliangye,�Եģ���������Һ����˼��
 */
class Wuliangye implements SellWine{

	@Override
	public void maijiu() {
		System.out.println("������������Һ��");
	}	
}
/**
 * ���ǻ���Ҫһ����̨�����ƻ��̣�
 */
class Guitai implements InvocationHandler {
	
	Object pinpai;
	public Guitai(Object pinpai) {//��Ϊ��object ���Կ��Խ����������͵Ľӿ�ʵ����
		this.pinpai = pinpai;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���ۿ�ʼ  ��̨�ǣ� "+this.getClass().getSimpleName());
		method.invoke(pinpai, args);
		System.out.println("���۽���");
		return null;
	}	
}

/**
 * Ȼ�����ǾͿ��������ˡ�
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		MaotaiJiu mt = new MaotaiJiu(); //�ӿڵ�ʵ����
		Wuliangye wly = new Wuliangye();
		Liqun lq = new Liqun(); 
		InvocationHandler jingxiao1 = new Guitai(mt); //ע������ �Ķ���
		InvocationHandler jingxiao2 = new Guitai(wly);
		InvocationHandler jingxiao3 = new Guitai(lq);
		/**
		 * ͨ�� Proxy �ľ�̬���� newProxyInstance �Żᶯ̬��������
		 * 		3������
		 * 1 loader ��Ȼ���������
		 * 2 interfaces ����Ҫ��������Ľӿ�
		 * 3 һ�� InvocationHandler ���� ��ע�룩
		 */
		SellWine sw1 = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
				MaotaiJiu.class.getInterfaces(), jingxiao1);
		SellWine sw2 = (SellWine) Proxy.newProxyInstance(Wuliangye.class.getClassLoader(),
				Wuliangye.class.getInterfaces(), jingxiao2);
		SellCigarette sc =(SellCigarette) Proxy.newProxyInstance(Liqun.class.getClassLoader(),
				Liqun.class.getInterfaces(), jingxiao3);
		sw1.maijiu();
		sw2.maijiu();
		sc.maiyan();
	}
}
