package chainOfResponsibility;

//���崦���ɫ��ConcreteHandler
public class DeptManager extends Handler {

	@Override
	public String handleFeeRquest(String user, double fee) {
		String str = "";
		// ���ž����Ȩ��ֻ����1000����
		if (fee < 1000) {
			// Ϊ�˲��ԣ��򵥵㣬ֻͬ������������
			if ("����".equals(user)) {
				str = "�ɹ������ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			}else {
				// ������һ�ɲ�ͬ��
                str = "ʧ�ܣ����ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			}
		} else {
			// ����1000���������ݸ�������ߵ��˴���
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRquest(user, fee);
			}
		}
		return str;
	}
}
