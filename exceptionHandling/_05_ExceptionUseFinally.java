public class _05_ExceptionUseFinally {
    public static void main(String[] args){
        try{
            int num = 4;
            int num2 = 0;
            System.out.println(num/num2);
        }
        finally{
            System.out.println("Hellooooo!");
        }
    }
    
}
