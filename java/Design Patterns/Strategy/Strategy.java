package Strategy;

// 抽象策略:通常情况下为一个接口，当各个实现类中存在着重复的逻辑时，则使用抽象类来封装这部分公共的代码，
// 此时，策略模式看上去更像是模版方法模式。
public interface Strategy {
	public void encrypt();
}
