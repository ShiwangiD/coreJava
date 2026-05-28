package collection;

import java.util.TreeSet;

public class _$Comparable {
    public static void main(String[] args){
        Student s1 = new Student("shiwangi", 90);
        Student s2 = new Student("shivi", 90);
        TreeSet<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }
    
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name= name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;
        
    }
}

/*
  when use comparable interface :=
   custom class ---> natural ordering ---> obvious

   Student 
     |
    / \
   s1  s2 

   Collections := utility class and static methods (sort(),min(),max(), fill(),reverse(), shuffle() 
     swap(), binarySearch() ,frequency() etc)
*/
