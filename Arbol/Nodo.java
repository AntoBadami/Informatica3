package Arbol;

public class Nodo<AnyType> {
    AnyType element;
    Nodo<AnyType> left;
    Nodo<AnyType> right;

  public Nodo(){
    this(null,null,null);
  }

  public Nodo(AnyType element, Nodo<AnyType> lt, Nodo<AnyType> rt){
    this.element = element;
    this.left = lt;
    this.right = rt;
  }

  public AnyType getElement(){
    return element;
  }
  public Nodo<AnyType> getLeft(){
    return left;
  }
  public Nodo<AnyType> getRight(){
    return right;
  }
  public void setElement(AnyType x){
    element = x;
  }
  public void setLeft(Nodo<AnyType> t){
    left = t;
  }
  public void setRight(Nodo<AnyType> t){
    right = t;
  }
  
  //return size of subtree at node
  public static <AnyType> int size(Nodo<AnyType> t){
    if(t == null)
        return 0;
    else 
        return 1 + size(t.left) + size(t.right);
  }
  //return height of subtree at node
  //return the height of the binary tree rooted at t
  public static <AnyType> int height(Nodo<AnyType> t){
    if(t==null)
      return -1;
    else
      return 1 + Math.max(height(t.left), height(t.right));
  }

  //print a preorder tre traversal
  public void printPreOrder(){
    System.out.println(element); //node
    if(left != null) left.printPreOrder(); //left
    if(right != null) right.printPreOrder(); //right
  }

  //print a postorder tree traversal
  public void printPostOrder(){
    if(left != null) left.printPostOrder(); //left
    if(right != null) right.printPostOrder(); //right
    System.out.println(element); //nodo
  }
  
  //print an inoder tree trsversal
  public void printInOrder(){
    if(left != null) left.printInOrder(); //left
    System.out.println(element); //nodo
    if(right != null) right.printInOrder(); //right
  }
  
  //return a duplicate tree
  public Nodo<AnyType> duplicate(){
    Nodo<AnyType> root = new Nodo<AnyType>(element, null, null);
    if(left != null)
        root.left = left.duplicate();
    if(right != null)
        root.right = right.duplicate();
    return root;
  }

}


