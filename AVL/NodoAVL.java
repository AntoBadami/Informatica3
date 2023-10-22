package AVL;

public class NodoAVL <AnyType> {
    AnyType element;
    int altura;
    NodoAVL<AnyType> left;
    NodoAVL <AnyType> right;

  public NodoAVL(AnyType theElement){
    this.element = theElement;
    this.altura = 1;
    left = right = null;
  }

  public void printInOrder(){
    if(left != null) left.printInOrder(); //left
    System.out.println(element); //nodo
    if(right != null) right.printInOrder(); //right
  }
  public void printPreOrder(){
    System.out.println(element); //node
    if(left != null) left.printPreOrder(); //left
    if(right != null) right.printPreOrder(); //right
  }
}
