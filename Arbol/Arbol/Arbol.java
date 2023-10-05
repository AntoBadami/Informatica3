package Arbol;

public class Arbol<AnyType> {
    private Nodo<AnyType> root;
    
    public Arbol(){
        root = null;
    }
    public Arbol (AnyType rootItem){
        root = new Nodo<AnyType>(rootItem, null, null);
    }
    public Nodo<AnyType> getRoot(){
        return root;
    }
    public int size(){
        return Nodo.size(root); 
    }
    public int height(){
        return Nodo.height(root);
    }

    public void printPreOrder(){
        if(root != null) root.printPreOrder();
    }
    public void printInOrder(){
        if(root != null) root.printInOrder();
    }
    public void printPostOrder(){
        if(root != null) root.printPostOrder();
    }

    public void makeEmpty(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void merge(AnyType rootItem, Arbol<AnyType> t1, Arbol<AnyType> t2){
        if (t1.root == t2.root && t1.root != null) {
            throw new IllegalArgumentException();
        }
        root = new Nodo<AnyType> (rootItem, t1.root, t2.root);

        if(this != t1)
            t1.root = null;
        if(this != t2)
            t2.root = null;
        
    }
    
}
