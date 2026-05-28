//Identifier := Name of a program element(Identifier = Name in code).

public class Identifier {
    public static void main(String[] args){
        int age = 20;
        int Age = 14;
        String stu_name = "shivi";
        String $last_name = "dubey";
        // int int i = 1; ====> invalid
        int a1 = 30;
        // String 1name = "hey"; ====> invalid
        System.out.println("all identifiers :"+age + " , "+ Age + " ,"+ stu_name + " ,"+$last_name + " ,"+a1);
    }
    
}



/*
 Rules for identifiers in Java :=

1.Must start with a letter (A–Z or a–z), underscore _, or dollar $
2. Cannot start with a digit
3. Can contain letters, digits, _, $
4. Cannot use Java keywords (like int, class, if)
5. Case-sensitive (Age and age are different)

*/
