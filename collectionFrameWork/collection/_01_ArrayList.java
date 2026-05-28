package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class _01_ArrayList {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<>();
         c.add(1);
        c.add(2);
        c.add(3);

         Collection<Integer> c1 = new HashSet<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);

        // size 

        // int n = c.size();
        // System.out.println(c.size());
        // System.out.println(c.isEmpty());

        // boolean contains(Object o) ---> 1,2,3 ---> equals()

        // System.out.println(c.contains(2));

        // iterator() --> Iterator 
        // object toArray();

        // Object[] obj = c.toArray();
        // for(Object o : obj){
        //     System.out.println(o);
        // }

        // T[] toArray(T[] a)

        // Integer[] arr2 = new Integer[0];
        // Integer[] ar = c.toArray(arr2);
        // for(Integer r : ar){
        //     System.out.println();
        // }

        // boolean add(E e),

        boolean b = c.add(4);
        System.out.println(b);

        boolean b1 = c1.add(3);
        System.out.println(b1);


        // boolean remove(Object obj) ----> equals mehods belongs to object class

        System.out.println(c1.remove(2));
        for(Integer r1 : c1){
            System.out.println(r1);
        }

        // boolean addAll(Collection<? extends E> c1)

        c1.addAll(List.of(5,6,7,8,9));
        System.out.println(c1);

        // boolean containsAll(Collection<?> c1)

        System.out.println(c1.containsAll(List.of(1,3)));

        // boolean removeAll(Collection<?> c)

        System.out.println(c1.removeAll(List.of(1,3)));
        for(Integer e : c1){
            System.out.println(e);
        }

        // boolean retainAll(Collection<?> c1) ------> work like Intersection
        System.out.println(c1.retainAll(List.of(5,6,7)));
        System.out.println(c1);

        // clear() :==
         c1.clear();
         System.out.println(c1);



    }
    
}


//collection interface :--> add(),remove(),addAll(),removeAll(),retailAll(),contains(),containsAll(),
// toArray(),iterator(),size(),isEmpty().
// Object ---> equals(),hashcode()
