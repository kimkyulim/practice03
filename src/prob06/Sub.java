package prob06;

public class Sub {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void setValue(int a, int b) {
		setA(a);
		setB(b);
	}
	public int calculate() {  // 계산하는 곳
		return getA() - getB();
	}
	

}
