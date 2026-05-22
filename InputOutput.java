// BufferedReader :=

import java.io.*;
public class InputOutput {
    public static void main(String[] args)throws IOException{ 
        
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);
      

    }
    
}

/*
 1. shiwangi i/p
 2.OS Buffer 
 3. System.in(InputStream )recieves bytes
 4. InputStreamReader ---> stream of bytes into stream of character
  ('s','h','i',........'i').
 5. BufferReader ----> readLine ---> shiwangi ----->name
 6. shiwangi o/p 
*/
