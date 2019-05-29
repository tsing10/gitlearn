package state;

public class LightOff implements LightState {

	@Override
	public void PressSwitch(Light light) {
		light.setLightState(new LightOn());
		System.out.println("µÆ¿ªÁË¡£¡£¡£");
	}

}
