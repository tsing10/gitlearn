package chainOfResponsibility;

//���崦���ɫ��ConcreteHandler
public class GenaralManager extends Handler {

	@Override
	public String handleFeeRquest(String user, double fee) {
		String str = "";
		// �ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
		if (fee >= 1000) {
			// Ϊ�˲��ԣ��򵥵㣬ֻͬ������������
			if ("����".equals(user)) {
				str = "�ɹ����ܾ���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			}else {
				// ������һ�ɲ�ͬ��
                str = "ʧ�ܣ��ܾ���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			}
		} else {
			// ������к�̵Ĵ�����󣬼�������
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRquest(user, fee);
			}
		}
		return str;
	}
}
