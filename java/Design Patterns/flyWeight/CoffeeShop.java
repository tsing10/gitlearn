package flyWeight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * 
 * FlyWeight实例
 *
 * 2019年5月28日
 */
//Instances of CoffeeFlavour will be the Flyweights
class CoffeeFlavour {
	private String name;

	public CoffeeFlavour(String newFlavour) {
		this.name = newFlavour;
	}

	@Override
	public String toString() {
		return name;
	}
}

//Menu acts as a FlyWeightFactory and cache for CoffeeFlavour flyweight objects
class Menu {
	private Map<String, CoffeeFlavour> flavours = new HashMap<String, CoffeeFlavour>();

	public CoffeeFlavour lookup(String flavourName) {
		if (!flavours.containsKey(flavourName)) {
			flavours.put(flavourName, new CoffeeFlavour(flavourName));
		}
		return flavours.get(flavourName);
	}

	public int totalCoffeeFlavoursMade() {
		return flavours.size();
	}
}

class Order {
	private final int tableNumber;
	private final CoffeeFlavour flavour;

	public Order(int tableNumber, CoffeeFlavour flavour) {
		this.tableNumber = tableNumber;
		this.flavour = flavour;
	}

	public void serve() {
		System.out.println("serving" + flavour + "to table" + tableNumber);
	}
}

 public class CoffeeShop {
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	private Menu menu = new Menu();

	public void takeOrder(String flavourName, int table) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table, flavour);
		orders.add(order);
	}

	public void service() {
		for (Order order : orders) {
			order.serve();
			orders.remove(order);
		}
	}

	public String report() {
		return "\ntotal CoffeeFlavour objects made:" + menu.totalCoffeeFlavoursMade();
	}

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();

		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Frappe", 1);
		shop.takeOrder("Espresso", 1);
		shop.takeOrder("Frappe", 897);
		shop.takeOrder("Cappuccino", 97);
		shop.takeOrder("Frappe", 3);
		shop.takeOrder("Espresso", 3);
		shop.takeOrder("Cappuccino", 3);
		shop.takeOrder("Espresso", 96);
		shop.takeOrder("Frappe", 552);
		shop.takeOrder("Cappuccino", 121);
		shop.takeOrder("Espresso", 121);

		shop.service();
		System.out.println(shop.report());
	}
}