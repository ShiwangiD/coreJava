import java.io.FileNotFoundException;
import java.io.FileReader;

public class _09_CompileTime {
    public static void main(String[] args){
        try {
            readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
         }
       
    }
    private static void readFile()throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
        

        //  try{
        //     FileReader fr = new FileReader("abc.txt");
        // }
        // catch(FileNotFoundException e){
        //     System.out.println("file not found");
        // }


    }

    
}


// Checked Exception --->  throws
