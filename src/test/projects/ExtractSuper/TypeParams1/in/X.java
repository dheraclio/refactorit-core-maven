package a.b.c;


public class X<T extends Object, U> extends Y<T> implements Z<U> {
  public void main() {
  }
}

class Y<T> {
}

interface Z<T> {
  void main();
}
