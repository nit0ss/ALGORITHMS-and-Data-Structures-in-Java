package libraries.dataStructures.models;



/**
 * Basic list with a useful pointer  
 * that can be used sequentially for accessing the 
 * colleciton of elements in the list
 *  
 * @version 1.0.0
 * @param <E> Generic Data type of the list
 */



public interface ListPointer<E>{

    void insert(E e);

    void delete();

    void start();

    void next();

    void end();

    E peek();

    boolean isEnd();

    boolean isEmpty();

    int size();
}
