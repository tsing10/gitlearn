package adapter.objectAdapter;

public class test {
	public static void main(String[] args) {
		Usb usb = new Usber();
		Ps2 p = new Adapter(usb);
		p.isPs2();
	}
}
