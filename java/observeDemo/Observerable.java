package observeDemo;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author yangshanqing
 *
 * 2019年5月26日
 * 
 */

public interface Observerable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
