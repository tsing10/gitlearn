package state;
/**
 * concreteState2
 * 2019��5��29��
 */
public class LightOn implements LightState {

	@Override
	public void PressSwitch(Light light) {
		light.setLightState(new LightOff());
		System.out.println("�ص��ˡ�����");
	}

}
