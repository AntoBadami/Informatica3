package Lista.Ejercicios;
import Lista.Utils.StackList;
/**
 * Ejercicio1
 */
public class StackListTest {
    public void testStackInteger() {
    StackList<Integer> stackList = new StackList<Integer>();

    try {
      stackList.push(20);
      stackList.push(15);
      stackList.push(10);
      stackList.push(100);

      System.out.println(stackList.pop());
      System.out.println(stackList.pop());
      System.out.println(stackList.pop());
      System.out.println(stackList.pop());
      System.out.println(stackList.pop());
      System.out.println(stackList.pop());

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public void testStackString() {
    StackList<String> stackListString = new StackList<String>();

    try {
      stackListString.push("Hola");
      stackListString.push("Mundo");
      stackListString.push("!!!");

      System.out.println(stackListString.pop());
      System.out.println(stackListString.pop());
      System.out.println(stackListString.pop());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

}
