package builder;

public class test {
	public static void main(String[] args) {
		Builder builder = new ComputerBuilder();
		Director director = new Director();
		director.construct(builder);
		builder.getComputer().show();
	}
}
