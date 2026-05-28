package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $ComparableInf {
    public static void main(String[] args){

        System.out.println("**** Using Natural Order sorting by Comparable Interface *****");
        List<Student> list = new ArrayList<>();
        list.add(new Student("shivi", 95));
        list.add(new Student("yashasvi", 98));
        list.add(new Student("nikita", 90));
        list.add(new Student("shikha", 95));
        
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name + " ," + s.marks);
        }


        System.out.println("*************** Using sort method ***************");

        List<Integer> list2 = new ArrayList<>();
        list2.add(110);
        list2.add(210);
        list2.add(130);

        Collections.sort(list2);
        System.out.println(list2);      
        
    }
    
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student other){
        // return this.marks - other.marks;
        // return other.marks - this.marks ;

        if(this.marks != other.marks){
            return this.marks - other.marks;
        }
        return this.name.compareTo(other.name);

    }
}


// this.mark - other.marks;
// <0 : this.marks, other.marks;
// >0 : other.marks, this.marks;





/*
  Comparable Interface (natural order interface) := Comparable is an interface in Java used to define the natural sorting order of objects.
  imported by util package in java .
  only one method in interface name is compareTo().
  (like functional interface).

  Return value :=
  0 ====>  object are equals
  +ve ===> current object is greater
  -ve ===> current object is smaller

  Rule :=
    If a.CompareTo(b) == 0
     then make sure , a.equals(b) ----> should be true.

*/
