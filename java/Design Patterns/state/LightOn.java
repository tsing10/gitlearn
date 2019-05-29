package state;
/**
 * concreteState2
 * 2019年5月29日
 */
public class LightOn implements LightState {

	@Override
	public void PressSwitch(Light light) {
		light.setLightState(new LightOff());
		System.out.println("关灯了。。。");
	}

}
