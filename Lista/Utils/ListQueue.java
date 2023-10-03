package Lista.Utils;

public class ListQueue<AnyType> {
    private Nodo<AnyType> front;
    private Nodo<AnyType> back;

    public ListQueue(){
        front = back = null;
    }
    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(AnyType x){
        if(isEmpty())
            back = front = new Nodo<AnyType>(x);
        else
            back = back.next = new Nodo<AnyType>(x);
    }

    public AnyType dequeue() throws Exception{
        if(isEmpty())
            throw new Exception("ListQueue dequeue");
        AnyType returnValue = front.data;
        front = front.next;
        return returnValue;
    }

    public AnyType getFront() throws Exception{
        if(isEmpty())
            throw new Exception("ListQueue getFront");
        return front.data;
    }

    public void makeEmpty(){
        front = null;
        back = null;
    }

}
