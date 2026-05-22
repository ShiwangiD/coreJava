public class BufferStr {
    public static void main(String[] args){
        String s = new String();
        System.out.println(s);
        System.out.println("");

        // char arr

        char[] arr = {'A','p','p','l','e'};
        String s2 =new String(arr);
        System.out.println(s2);
        //arr[0] ='l';
        System.out.println(s2);// apple ---> string is immutable
        
        // char array subset
        String s3 = new  String(arr,0,4);
        System.out.println(s3);

        byte[] arr2 ={98,97,99};
        String s4 = new String(arr2);
        System.out.println(s4);

        // StringBuilder and StringBuffer ---->
        StringBuffer sb = new StringBuffer("Hello");
        String s5 = new String(sb);
        System.out.println(s5);

        StringBuffer sf = new StringBuffer("lovely");
        String s6 = new String(sf);
        System.out.println(s6);

        // String Methods :=

        String str = new String("  ");

        // Length/Emptiness
        System.out.println(str.length());//2
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//blank


        // Character access
        String str1 = new String("lovely");
        System.out.println(str1.charAt(2));
        System.out.println(str1.toCharArray());

        //Comparition 

        String str2 = new String("    shiwangi  ");
        String str3 = new String("shiwangi");
        System.out.println(str2.equals(str3));
         System.out.println(str2.equalsIgnoreCase(str3));

         // lexicographical comparition
          System.out.println(str2.compareTo(str3));

          // Searching 
          System.out.println(str2.contains("iwang"));
          System.out.println(str2.indexOf('w'));
          System.out.println(str2.indexOf("angi"));
          System.out.println(str2.lastIndexOf("gi"));
          System.out.println(str2.startsWith("shi"));
          System.out.println(str2.endsWith("ng"));

          //Exaction/ Transfomation
          System.out.println(str2.substring(3,5));
          System.out.println(str2.toUpperCase());
          System.out.println(str2.toLowerCase());
          System.out.println(str2.trim());
          System.out.println(str2.strip());
          System.out.println(str2.repeat(3));
          System.out.println(str2.replace('i', 'o'));
          System.out.println(str2.replaceAll("iw", "al"));

          String str4 = "Lovely, Shiwangi, Dubey";
          String[] arr3 = str4.split(",");
          for(String sp: arr3){
            System.out.println(sp);
          }
       System.out.println(String.join("_", "a","d","i","t","y","a"));

       // Conversion 

       String str5 = new  String(String.valueOf(10));
       System.out.println(str5);
       
       byte[] arr6 = str3.getBytes();
       for(int i : arr6){
         System.out.println(i + " , ");
       }

       // Advaced method ---> intern(), format()

       String str6 = new String("Hello");
       String str7 = str6.intern();
       System.out.println(str6 == str7);

       // format()

       String name = "shivi";
       int age = 24;
       System.out.println(String.format("hello %s, your age is %s",name,age));
       


        // equals()--> == ---> Refrences compare
        // compareTo()--> -ve, 0 ,+ve

    }
    
}
