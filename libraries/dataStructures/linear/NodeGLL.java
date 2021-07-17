package libraries.dataStructures.linear;

/** Friendly class that represents a Node from a Generic Linked List
 *  It Has:
 *  - A  datum/data, the element which contains the Node
 *  - next: attribute which references the next node
 *  
 */

 class NodeGLL<E>{

    E data;
    NodeGLL<E> next;

    //Constructor
    /** Creates a node that contains the E element and the reference
     * to the next Node
     * @param e Element which contains the Node itself
     * @param s Next node
     */

     NodeGLL(E e, NodeGLL<E> s){
         this.data = e;
         this.next = s;
     }

     //Constructor for a single node

     /** Node who contains data e but isnt followed by anyhitng.
      * @param e Element which contains the Node itself
      */

    NodeGLL(E e){
        this.data = e;
        this.next = null;
    }

 }