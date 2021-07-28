package libraries.dataStructures.linear;
import libraries.dataStructures.models.ListPointer;


public class GLListP<E> implements ListPointer<E>{
    protected NodeGLL<E> first, prev, last;
    protected int size;


    /** Constructor of empty List with Pointer */

    public GLListP(){
        first = prev = last = new NodeGLL<E>(null);
        size = 0;
    }

    public void insert(E e){
        NodeGLL<E> newNode = new NodeGLL<E>(e, prev.next);
        prev.next = newNode;
        if (newNode.next == null) last = newNode;
        prev = prev.next;
        size ++; 
    }

    public void delete(){
        size --;
        if (prev.next == last) last = prev;
        prev.next = prev.next.next;
    }

    public void start(){
        prev = first;
    }

    public void next() {
        prev = prev.next;
    }

    public void end(){
        prev = last;
    }

    public E peek(){
        return prev.next.data;
    }

    public boolean isEnd(){
        return prev == last;
    }

    public boolean isEmpty(){
        return first == last;
    }


    public int size(){return size;}

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        NodeGLL<E> aux = first.next;         
        for (int i = 1; i < size; i++, aux = aux.next) {            
            s.append(aux.data.toString() + ", ");
        }
        if (size != 0) {
            s.append(aux.data.toString() + "]"); 
        } else { s.append("]"); }
        return s.toString();



    }

}


    



