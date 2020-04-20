package staticPackage;

public class StaticKeynotesDemo {

	public int addNum=10;
	public static int addStaticNum=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int output = staticSum(20);
		System.out.println("the output is: " + output);

	}
	
	public int sum(int num) {
		return num + addNum;
	}

	public static int staticSum(int num) {
		return num + addStaticNum;
	}

}
