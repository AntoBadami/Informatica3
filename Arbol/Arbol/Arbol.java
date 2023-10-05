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

    //TODO implementar
    
    public void merge(AnyType rootItem, Nodo<AnyType> t1, Nodo<AnyType> t2){
        if (t1 == t2 && t1 != null) {
            throw new IllegalArgumentException();
        }
        root = new Nodo<AnyType> (rootItem, t1, t2);

        if(this.root != t1)
            t1 = null;
        if(this.root != t2)
            t2 = null;
        
    }/* 
    public Nodo<AnyType> merge(AnyType rootItem, Nodo<AnyType> t1, Nodo<AnyType> t2) {
        if (t1 == t2 && t1 != null) {
            throw new IllegalArgumentException();
        }
        root = new Nodo<AnyType>(rootItem, t1, t2);
    
        // Establecer las referencias originales en null
        t1 = null;
        t2 = null;
    
        return root;
    }*/
    
    
}
