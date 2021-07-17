package libraries.dataStructures.models;

/** Implementing basic List interface 
*@author (nitoss)
*@version 1.0.0
*@param <E> Generic data type
 */

public interface List<E>{

    void insert(E e, int i); //insert 'e' into 'i' position
    
    void delete(int i);

    E peek(int i); //peeks value at 'i' position

    boolean isEmpty();

    int size();
    
}
