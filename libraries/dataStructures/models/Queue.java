package libraries.dataStructures.models;

/**
 * Generic Queue with FIFO
 * @param <E>
 * 
 * @author nit0ss 
 * @version 1.0.0
 */

 public interface Queue<E>{
    void queueUp(E e);
    E desize();
    E first();
    boolean isEmpty();
    int size();
 }