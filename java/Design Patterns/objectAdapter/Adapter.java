package adapter.objectAdapter;

public class Adapter extends Usber implements Ps2 {

	private Usb usb;

	public Adapter(Usb usb) {
		this.usb = usb;
	}

	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		usb.isUsb();
	}

}
