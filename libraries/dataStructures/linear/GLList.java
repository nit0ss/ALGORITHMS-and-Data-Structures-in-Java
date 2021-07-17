package libraries.dataStructures.linear;


import libraries.dataStructures.models.*;


/** Implementing Generic Linked List throughout a List
*@author (nitoss)
*@version 1.0.0
*@param <E> Generic List Data Type
 */

 
 public class GLList<E> implements List<E>{
 
    //A Generic Linked List HAS:
    protected NodeGLL<E> first;
    protected int size;

    //Constructor: new empty list with size=0
    public GLList(){
        this.first = null;
        this.size = 0;
    }

    /** SII 0<= i <= size()
     * inserts element 'e' into the position 'i'
     * @param e Element to be inserted
     * @param i Position in the list
     */

     public void insert(E e, int i){
        NodeGLL<E> newNode = new NodeGLL<E>(e); //NodeGLL(E e)
        size++;
        NodeGLL<E> aux = first;
        NodeGLL<E> prev = null;

        for(int j = 0 ; j < i ; j++){
            prev = aux;
            aux = aux.next;
        }

        newNode.next = aux;
        if(prev == null) first = newNode;
        else prev.next = newNode;

        }
    /** 
     *  Deletes the node @ 'i'
     */
     public void delete(int i){
        size --;
        NodeGLL<E> aux = first;
        NodeGLL<E> prev = null;

        for(int j=0; j<i; j++){
            prev = aux;
            aux = aux.next;
        }
        if(prev == null) first = aux.next;
        else prev.next = aux.next;
     }
     /**
      * Returns the value at 'i' 
      * SII size()>0 AND 0<= i < size();
      */
     public E peek(int i){
        NodeGLL<E> aux;
        int j;
        for(aux = first, j=0; j<i; aux = aux.next, j++);
        return aux.data;
     }
     /**Checks if the List is empty */
     public boolean isEmpty(){
         return first == null; // size == 0 is also Ok
     }
     /**Method that returns the size of the list */
     public int size(){
        return this.size;
     }
 
     /** Returns the GLList into a String 
      *  in standard format ex: [1, 2, 3, 4];
      */ 
      public String toString() { 
        StringBuilder res = new StringBuilder();
        res.append("[");
        if (size == 0) return res.append("]").toString();
        NodeGLL<E> aux = first; 
        for (int i = 0, j = size - 1; i < j; i++, aux = aux.next)
            res.append(aux.data.toString() + ", ");
        res.append(aux.data.toString() + "]"); 
        return res.toString();
    }
 }

     
     

 
    
 


