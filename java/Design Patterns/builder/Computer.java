package builder;

import java.util.ArrayList;
import java.util.List;

//≥…∆∑¿‡
public class Computer {
	List<String> parts = new ArrayList<String>();

	public void show() {
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
