
public class Test1 {

  int field = 0;

  void fun() {
    int i;
    /*]*/
    i = 0;
    System.out.println("i, field == " + i++ + ", " + field);
    /*[*/
  }
}
