package builder;

//×é×°Àà
public class Director {
	public void construct(Builder builder) {
		builder.CPU();
		builder.mainBoard();
		builder.DISK();
		builder.memory();
		builder.power();
	}
}
