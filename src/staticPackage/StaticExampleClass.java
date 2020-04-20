package staticPackage;

public class StaticExampleClass {

	private String make; 
	static private int instanceNum=0;
	
	public StaticExampleClass (String make) {
		this.make= make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstance() {
		return instanceNum;
	}
}
