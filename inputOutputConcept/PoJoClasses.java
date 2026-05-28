// POJO := Plain Old Java Object.

public class PoJoClasses {
    public static void main(String[] args){

        Student s = new Student(2, "shivi");
        System.out.println(s);
        
    }   
}

class Student{
    private int id ;
    private String name;

    Student(){
        
    }

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Student{id=" + id + 
        ", name='" + name + "'}";
    }
}




// POJO ===> Anemic model(getter/ setter, constructor and fields) + Domein model(Bussiness logic).
// not tied to any special framework rules.
// Note :== Mainly use for store data
/*
 ### Rules :-
1. has private fields
2.provides getters and setters
3.may have constructors
4.may override toString()
*/ 