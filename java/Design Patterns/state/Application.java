package state;
/**
 * ״̬ģʽ
 * context
 * 2019��5��29��
 */
public class Application {
	public static void main(String[] args) {
		Light light = new Light(new LightOff());
		light.PressSwitch();
		light.PressSwitch();
	}
}
