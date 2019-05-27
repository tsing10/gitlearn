package builder;

public class ComputerBuilder implements Builder{
	private Computer computer = new Computer();
	@Override
	public void CPU() {
		computer.parts.add("采用INTEL的CPU");	
	}

	@Override
	public void mainBoard() {
		computer.parts.add("采用大型主版");
	}

	@Override
	public void memory() {
		computer.parts.add("采用8G内存");
		
	}

	@Override
	public void DISK() {
		computer.parts.add("采用1TB固态硬盘");
		
	}

	@Override
	public void power() {
		computer.parts.add("采用XXX电源");
		
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
