package p1;

public class Class1 {
	private int t1;
	public void f1() {
	}
	public void f2() {
	}

	private int f3() {
		return 1;
	}
}

class Class2 extends Class1 {
// multiple uses
public int tmp1;
public void func1() {
func2();
tmp1 = 1;
}
public void func2() {
}

}
