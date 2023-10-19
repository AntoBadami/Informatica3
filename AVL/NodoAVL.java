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
}
