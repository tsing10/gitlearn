package chainOfResponsibility;

//�������ɫ��
public abstract class Handler {
	/**
	 * ���к�̵����ζ���
	 */
	protected Handler successor = null;// ������

	/**
	 * ȡ������
	 * 
	 * @return successor
	 */
	public Handler getSuccessor() {
		return successor;
	}

	/**
	 * ���ú�̵����ζ���
	 * 
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	/**
	 * ����۲ͷ��õ�����
	 * 
	 * @param user ������
	 * @param fee  ����ľ۲ͷ���
	 * @return �ɹ���ʧ�ܵľ���֪ͨ
	 */
	public abstract String handleFeeRquest(String user, double fee);

}
