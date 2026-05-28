package Queue;

import java.util.PriorityQueue;

public class _02_PriorityQueue {
    public static void main(String[] args){

      System.out.println("************************ Min Heap ***************");

      // min heap
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      pq.offer(10);
      pq.offer(30);
      pq.offer(20);
      pq.offer(40);
      pq.offer(50);

      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());

      System.out.println("***************** Max Heap ******************");
      

       // max heap 
      PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)-> b-a);
      pq2.offer(10);
      pq2.offer(30);
      pq2.offer(20);
      pq2.offer(40);
      pq2.offer(50);

      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());


    }
    
}




/*
  Queue := The element inserted first is removed first.

          Queue --------|
            |           |
         Deque     PriorityQueue
     /          \
     ArrayDeque  LinkedList

  Priority queue := Stores elements according to priority (sorted order).
   Feature :=
     1. complete binary tree 
     2. using heap data structure
     3. by default using in java min heap concept.
     4. parent = i
        2i + 1 = left node
        2i + 2 = right node .   
*/
