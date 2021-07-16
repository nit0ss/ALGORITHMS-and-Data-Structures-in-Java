package libraries.dataStructures.lineal;

//import libraries.dataStructures.models.Queue;
/** Implementing queue interface throughout an Array 
*@author (nitoss)
*@version 1.0.0
*@param <E> Array generic data type
 */

public class arrayQueue<E> implements Queue<E>{
    //Class atributes
    protected static final int default_capacity  = 50;
    //Instance atributes
    protected E[] array; 
    protected int end,first,size;
    
    //Constructor
    @SuppressWarnings("unchecked")

    public arrayQueue(){
        array = (E[]) new Object[default_capacity];
        first = 0;
        end = -1;
        size = 0;
    }

    public void queueUp(E e){
        if(size == array.length){ expandQueue();}  //We make the array bigger so it fits in case it doesnt
        end = increment(end);
        array[end] = e;
        size++;
        
    }


}