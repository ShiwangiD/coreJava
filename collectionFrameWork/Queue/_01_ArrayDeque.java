package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class _01_ArrayDeque {
    public static void main(String[] args){

        // single ended queue
        Queue<Integer> queue = new ArrayDeque<>();

        //enqueue methods
        queue.add(1); // throw exception
        queue.offer(2); // false
        queue.offer(3);
        System.out.println(queue);

        //front access
         System.out.println(queue.peek()); // top value and return null
        System.out.println(queue.element()); // work same as peak method and throw exception

        // element remove 

        queue.remove(); // throw exception and unsafe method 
        queue.poll(); // return null and safe



    
    }
    
}


/*
Note := deque implemented by arrayDeque and LinkedList 
   Methods of queue :-

   UnSafe methods throw excetion :=
    addFirst()          
    addLast()
    removeFirst()
    removeLast()
    getFirst()
    getlast()

    Safe methods return null

    offerFirst()
    offerLast()
    pollFirst()
    pollLast()
    peakFirst()
    peakLast()
*/
