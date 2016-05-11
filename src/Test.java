
public class Test {
	public static void main(String[] args) {
		A a = new A(1);

		A[] arr = { a };
		A[] arr2 = arr.clone();

		arr2[0].setI(22);
		System.out.println(arr2[0]);
	}
}

class A {
	private int i;

	public A(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	
}