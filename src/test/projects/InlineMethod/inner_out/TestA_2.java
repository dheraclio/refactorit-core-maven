public class TestA_2 {

  public static void hh() {
    Inner.toInline();
    Inner.innerZ = 1;
  }

  public void h2() {
    hh();
  }

  static class Inner {
    public static int innerZ;
    public static void toInline() {
      new InnerInner.Inner2() {};
      TestA_2 zzz = new TestA_2();
      InnerInner.Inner2.he2();
      new InnerInner();
    }

    void f() {
      toInline();
      InnerInner.Inner2.jj(3, 4, 5);
    }

    static class InnerInner {
      static class Inner2 {

        public static void he() {
          new InnerInner();
          jj(2, 3, 4);
        }

        public static void he2() {
          new InnerInner();
          jj(2, 3, 4);
          jj(1, 2, 3);
        }

        public static void jj(int a, int b, int c) {
          a = b;
          b = c;
          c = a;

        }
      }
    }
  }
}
