package decorator;

public class test {
	public static void main(String[] args) {
		ChineseStyle chineseStyle = new ChineseStyle();
		House redChineseStyle = new RedDecorator(new ChineseStyle());
		House redEuropeanStyle = new RedDecorator(new EuropeanStyle());
		System.out.println("��ʽװ��****************");
		chineseStyle.style();

		System.out.println("��ʽ�Ӻ�ɫǽ************");
		redChineseStyle.style();

		System.out.println("ŷʽ�Ӻ�ɫǽ************");
		redEuropeanStyle.style();

	}
}
