package CheckPossibleAccessForInner1.p1;
/**
 * @violations 3
 */
public class A {
	public void f() {
		Inner1 a;
	}

	public class Inner1 {
	}

	public class Inner2 {
	}

	public class Inner3 {
	}
}
