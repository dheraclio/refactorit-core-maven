package com.p1;

public class Class1 {
	protected void f() { }
}


class Class2 extends Class1 {
	protected void f() { }

	private void foo() {
		f();
	}
}
