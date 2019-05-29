package state;

public class Light {
	private LightState lightState;
	
	public Light(LightState lightState) {
		this.lightState = lightState;
	}

	public LightState getLightState() {
		return lightState;
	}

	public void setLightState(LightState lightState) {
		this.lightState = lightState;
	}
	
	public void PressSwitch() {
		lightState.PressSwitch(this);
	}
}
