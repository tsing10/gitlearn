package builder;

public class ComputerBuilder implements Builder{
	private Computer computer = new Computer();
	@Override
	public void CPU() {
		computer.parts.add("����INTEL��CPU");	
	}

	@Override
	public void mainBoard() {
		computer.parts.add("���ô�������");
	}

	@Override
	public void memory() {
		computer.parts.add("����8G�ڴ�");
		
	}

	@Override
	public void DISK() {
		computer.parts.add("����1TB��̬Ӳ��");
		
	}

	@Override
	public void power() {
		computer.parts.add("����XXX��Դ");
		
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
