import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int n =0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
         n = sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i == 0){
                System.out.println("Number is not prime");
                break;
            }
        }
        if(n == i){
            System.out.println("Number is prime number");
        }
        sc.close();
    }
    
}

