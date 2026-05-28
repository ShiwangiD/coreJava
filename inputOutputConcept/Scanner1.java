import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();

    }
    
}
