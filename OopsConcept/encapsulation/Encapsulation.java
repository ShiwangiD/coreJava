// Encapsulation :=
public class Encapsulation {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposite(500);
        ba.withDraw(300);
        System.out.println(ba.getBalance());

        Student s1 = new Student("neel", 28, 0101, "Ducat");
        System.out.println(s1.getCollage());
        System.out.println(s1.getName()); 
    } 
}

class BankAccount{
  private double balance;

  public void deposite(int amount){
    balance += amount;

  }
  public void withDraw(int amount){
    balance -= amount; 
}

// getter and setter
public double getBalance(){
    return balance;
}
}

class Student{
    private String name;
    private int age;
    private int rollNo;
    private String collage;

    Student(String name, int age, int rollNo, String collage){
        this.name= name;
        this.age= age;
        this.rollNo= rollNo;
        this.collage= collage;
    }

    // getter and setter :---> private value direct not access that's why using getter and setter using

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

     public String getCollage(){
        return collage;
    }
    public void setCollage(String collage){

    // validation ---> should be real
        this.collage=collage;
    }
}

