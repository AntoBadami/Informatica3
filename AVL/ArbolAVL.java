package AVL;

public class ArbolAVL <AnyType extends Comparable<? super AnyType>> {
    protected NodoAVL<AnyType> root;

    public ArbolAVL(){
        root = null;
    }
    public void insert (AnyType x) throws Exception{
        root = insert(x, root);
    }
    public void remove (AnyType x) throws Exception{
        root = remove(x, root);
    }
    public void removeMin() throws Exception{
        root = removeMin(root);
    }
    public AnyType findMin(){
        return elementAt(findMin(root));
    }
    public AnyType findMax(){
        return elementAt( findMax(root));
    }
    public AnyType find(AnyType x){
        return elementAt(find(x,root));
    }
    public void makeEmpty(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }

    private AnyType elementAt(NodoAVL<AnyType> t){
         return (t == null) ? null : t.element;
    }
    private NodoAVL<AnyType> find(AnyType x, NodoAVL<AnyType> t){
        while(t != null){
            if(x.compareTo(t.element) < 0){
                t = t.left;
            }else if(x.compareTo(t.element) > 0){
                t = t.right;
            }else{
                return t;
            }
        }
        return null;
    }
    private NodoAVL<AnyType> findMin(NodoAVL<AnyType> t){
        if(t != null){
            while(t.left != null){
                t = t.left;
            }
        }
        return t;
    }
    private NodoAVL<AnyType> findMax(NodoAVL<AnyType> t){
        if(t != null){
            while(t.right != null){
                t = t.right;
            }
        }
        return t;
    }
    protected NodoAVL<AnyType> insert (AnyType x, NodoAVL<AnyType> t) throws Exception{
        if(t == null){
            t = new NodoAVL<AnyType>(x);
        }else if(x.compareTo(t.element) < 0){
            t.left = insert(x, t.left);
        }else if(x.compareTo(t.element) > 0){
            t.right = insert(x, t.right);
        }else{
            throw new Exception(x.toString()); //DuplicateItemException(x.toString());
        }
        
        return t;
    }
    protected NodoAVL<AnyType> removeMin(NodoAVL<AnyType> t) throws Exception{
        if(t == null){
            throw new Exception(); // ItemNotFoundExceptios();
        }else if(t.left != null){
            t.left = removeMin(t.left);
            return t;
        }else{
            return t.right;
        }
    }
    protected NodoAVL<AnyType> remove(AnyType x, NodoAVL<AnyType> t)throws Exception{
        if(t == null){
            throw new Exception(x.toString()); //ItemNotFoundException(x.toString());
        }
        if(x.compareTo(t.element) < 0){
            t.left = remove(x, t.left);
        }else if(x.compareTo(t.element) > 0){
            t.right = remove(x, t.right);
        }else if(t.left != null && t.right != null){
            t.element = findMin(t.right).element;
            t.right = removeMin(t.right);
        }else{
            t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }


    //metodo para obtener la altura de un nodo
    public int altura (NodoAVL<AnyType> nodo){
        if(nodo == null) return 0;
        return nodo.altura;
    }

    //Metodo para actualizar la altura de un nodo
    public void actualizarAltura(NodoAVL<AnyType> nodo){
        nodo.altura = 1+ Math.max(altura(nodo.left), altura(nodo.right));
    }

    //rotacion simple a la izquierda
    public NodoAVL<AnyType> rotacionSimpleIzq (NodoAVL<AnyType> k2){
        NodoAVL <AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    //rotacion simple a la derecha
    public NodoAVL<AnyType> rotacionSimpleDer (NodoAVL<AnyType> k2){
        NodoAVL <AnyType> k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;
        return k1;
    }

    //rotacion doble a la izquierda

    //rotacion doble a la derecha
    
}

