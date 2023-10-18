package ArbolDeBusqueda.Utils;

public class BinaryNode<AnyType> {
    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;

  public BinaryNode(AnyType theElement){
    this.element = theElement;
    left = right = null;
  }

}



