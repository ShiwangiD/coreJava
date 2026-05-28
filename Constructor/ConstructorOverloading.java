// constructor Overloading :=
public class ConstructorOverloading {
    String name;
    int age;
    int rollNo;
    String collage;

    ConstructorOverloading(String name){
        this.name=name;
    }
    ConstructorOverloading(String name, int age, int rollNo){
        this.name=name;
        this.age= age;
        this.rollNo=rollNo;
    }
    ConstructorOverloading(String name , int age, int rollNo, String collage){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.collage=collage;

    }

    void display(){
        System.out.println("name : "+name);

    }
    void display1(){
         System.out.println("name : "+name+ " age : " +age+ " rollNo : "+rollNo);

    }
    void display2(){
          System.out.println("name : " +name+ " age : " +age+ " rollNo : "+rollNo + " collage : " +collage);

    }
    public static void main(String[] args){
        ConstructorOverloading s1= new ConstructorOverloading("shivi");
        ConstructorOverloading s2= new ConstructorOverloading("shivi",24,101);
        ConstructorOverloading s3 = new ConstructorOverloading("shikha",21,102,"Ducat");
        s1.display();
        s2.display1();
        s3.display2();

    }
    
}
