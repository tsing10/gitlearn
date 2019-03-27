package proxyDemo;

/**
 * 
 * @author yangshanqing
 *
 * 2019��3��27��
 * 
 * ��̬����

����ƽ��ȥ��ӰԺ����Ӱ��ʱ���ڵ�Ӱ��ʼ�Ľ׶��ǲ��Ǿ�����Ź���أ�

��Ӱ�ǵ�Ӱ��˾ί�и�ӰԺ���в��ŵģ�����ӰԺ�����ڲ��ŵ�Ӱ��ʱ�򣬲���һЩ�Լ��ľ������棬���������׻������ֵȣ�Ȼ����ӰƬ��ʼ����ʱ����һЩ��档

�����ô���������ģ�⡣
 */

/**
 * 
 * ���ȵ���һ���ӿڣ�ͨ�õĽӿ��Ǵ���ģʽʵ�ֵĻ���������ӿ���������Ϊ Movie�������Ӱ���ŵ������� ��Ӱ�ӿ�
 */
interface Movie {
	void play();
}

/**
 * Ȼ������Ҫ��һ��������ʵ����� Movie �ӿڵ��࣬��һ��ֻ��ʵ�ֽӿڵĴ����ࡣ RealMovie��ʾ������ӰƬ����ʵ���� Movie
 * �ӿڣ�play() ��������ʱ��ӰƬ�Ϳ�ʼ���š���ô Proxy �����أ�
 */
class RealMovie implements Movie {

	@Override
	public void play() {
		System.out.println("�����ڹۿ���Ӱ ��Ф��˵ľ��꡷");
	}
}

/**
 * Cinema��ӰԺ ���� Proxy �����������һ�� play() �������������� play()
 * ����ʱ����������һЩ�������Ĵ����Ǿ��ǹ�档���ڣ����Ǳ�д���Դ��롣
 */
class Cinema implements Movie {
	RealMovie rm = new RealMovie(); // ��������������ڴ�������

	public Cinema(RealMovie movie) {
		super(); // ????�����ǣ�
		this.rm = movie;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		guanggao(true);
		rm.play();
		guanggao(false);
	}

	void guanggao(boolean isStart) {
		if (isStart) {
			System.out.println("��Ӱ���Ͽ�ʼ�ˣ����׻������֡�������9.8�ۣ������򰡣�");
		} else {
			System.out.println("��Ӱ���Ͻ����ˣ����׻������֡�������9.8�ۣ���ؼҳ԰ɣ�");
		}
	}

}

/**
 * ���Ծ�̬������
 */
public class StaticProxyTest {
	public static void main(String[] args) {
		RealMovie rm = new RealMovie();
		Movie movie = new Cinema(rm); // �ӿڿ��Խ���ʵ�ָýӿڵ���Ķ���
		movie.play();
	}
}
