public class Test2 {
    public static void main(String[] args){
        Box b = new Box(3);
        System.out.println(b.getVaule());
        Box2 b1 = new Box2("shiwangi");
        System.out.println(b1.getString());
        Box3 b2 = new Box3(1000000);
        System.out.println(b2.getSalary());
    }
    
}

class Box{
    private int value;
    Box(int value){
        this.value = value;
    }

    public int getVaule(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;

    }
}

class Box2{
    private String name;

    Box2(String name){
        this.name= name;
    }
    public String getString(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class Box3{
    private double salary;
    Box3(int salary){
        this.salary=salary;

    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
