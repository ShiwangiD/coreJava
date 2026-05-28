// Object Class = Parent class of all Sub classes in java or root class also called .

public class RootClass {
    public static void main(String[] args)throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name="aditya";
        s1.age=28;

        // System.out.println(s1);

        // Student s2 = new Student();
        // s2.name="aditya";
        // s2.age= 24;

        // System.out.println(s1.equals(s2));
        // System.out.println(s1 == s2);

        // System.out.println(s1.hashCode() == s2.hashCode());
        // System.out.println(s1.getClass().getName());

        // System.out.println(s1 instanceof Student);
        // System.out.println(s1 instanceof Object);

        // Animal a = new Animal();
        // Animal d = new Dog();

        // System.out.println(a.getClass().getName());
        // System.out.println(d.getClass().getName());

        // System.out.println(a instanceof Animal);
        // System.out.println(d instanceof Animal);

        Student s3 = (Student)s1.clone();
        System.out.println(s3);

    }
    
}

// instanceOf Operator := check if an object is instance of a class.
class Student extends Object implements Cloneable{
    String name;
    int age;

    // toString():=Java Object class used to return an object’s string representation.
    @Override
    public String toString(){
        return (name + " , " + age);
    }

    // equals():= Compare 2 object & return true and false

    @Override
    public boolean equals(Object obj){
        return false;// compare references

    }

    // hashCode():= Return an integer of an object , hash(decimal formate).
    // Note = if two objects are equal then hash code must be equal.

      @Override
    public int hashCode(){
        int result = 17;
         result = result * 31 + age;
         result = result *31 + name.hashCode();
        return result;

    }

    // Clone() := create copy of object.

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

   
}

class Animal{

}

class Dog extends Animal{

}
