package JDKProxyDemo;

/**
 * 
 * @author yangshanqing
 *
 * 2019��3��27��
 * ���¶���һ�� ���̵Ľӿ�SellCigarette �� ���̵�ʵ����Liqun
 * ��֤ ��̬�ӿڵ�����
 */
interface SellCigarette {
	void maiyan();
}

public class Liqun implements SellCigarette{

	@Override
	public void maiyan() {
		System.out.println("�����������ڵ���Ⱥ������ɨ���������֤��");
	}
}



