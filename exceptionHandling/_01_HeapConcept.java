import java.util.ArrayList;
import java.util.List;

public class _01_HeapConcept {
    public static void main(String[] args){
        List<int[]> list = new ArrayList<>();
        int count = 0;
        while(true){
            list.add(new int[250000]);// int ---> 4 byte  1M byte ---> 1M byte
            count++;
            System.out.println("Allocated Block :" + count);
        }
        
    }
    
}
