public class AbstractClasses {
    public static void main(String[] args){
        Animal a = new Dog("ucci");
        a.makeSound();
    }  
}

abstract class Animal{
    String name;

    Animal(String name){
        this.name=name;
    }
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping");
    } 
}
class Dog extends Animal{

    Dog(String name){
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println("making barking sound");   
    }
}



/*
  Key points :=
  1.Cannot be instantiated directly.
  2. Can contain abstract method (method without implementations).
  3. Can also contain normal methods.
  4. Is mean to be extended.

  Questions :=
  1. can abstraction classes  have constructor?
    yes
  2. Can abstraction classes be final ?
    No (final is not inherit and abstrction is inherit so java not allow).
  3. Can abstraction classes have static methods/variable?
     yes (static varible, static methods and static blocks).
  4. Can abstract classes have private method?
     yes ---->but non abstract 
  5. Can abstract classes have final methods?
     yes but can not override and non abstrct method 
   6. Can abstract classes have no abstract methods ?
      yes.
     */
