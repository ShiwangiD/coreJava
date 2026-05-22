public class Array {
    public static void main(String[] args){
        int[] rollno = new int[3];
        // 102,103,104
        // rollno[0] = 102;
        // rollno[1] = 103;
        // rollno[2] = 104;

        // System.out.println(rollno[0]);
        // System.out.println(rollno[1]);
        // System.out.println(rollno[2]);

        // System.out.println(rollno.length);

        int x = 101;
        for(int i =0;i<rollno.length;i++){
            rollno[i] = x;
            x++;
        }
        for(int i=0; i<rollno.length; i++){
            System.out.println(rollno[i]);
        }
    }
    
}
