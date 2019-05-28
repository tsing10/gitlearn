package chainOfResponsibility;

//抽象处理角色类
public abstract class Handler {
	/**
	 * 持有后继的责任对象
	 */
	protected Handler successor = null;// 继任者

	/**
	 * 取继任者
	 * 
	 * @return successor
	 */
	public Handler getSuccessor() {
		return successor;
	}

	/**
	 * 设置后继的责任对象
	 * 
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	/**
	 * 处理聚餐费用的申请
	 * 
	 * @param user 申请人
	 * @param fee  申请的聚餐费用
	 * @return 成功或失败的具体通知
	 */
	public abstract String handleFeeRquest(String user, double fee);

}
