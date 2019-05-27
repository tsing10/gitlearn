package Strategy;

//封装类:也叫上下文，对策略进行二次封装，目的是避免高层模块对策略的直接调用。
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void encrypy() {
		this.strategy.encrypt();
	}
}
