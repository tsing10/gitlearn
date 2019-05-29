package state;
/**
 * 状态模式
 * context
 * 2019年5月29日
 */
public class Application {
	public static void main(String[] args) {
		Light light = new Light(new LightOff());
		light.PressSwitch();
		light.PressSwitch();
	}
}
