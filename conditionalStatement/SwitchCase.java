public class SwitchCase {
	void meth1() {
		System.out.println("implimenting the switch case");
		int a = 10;
		byte b = 30;
		switch(b+10) {
//		System.out.println("hello world"); // c.e 
		default:
			System.out.println("No case labels got trigger which the key value ");
			System.out.println("a value is :"+a);
			break;
		case 10:
			System.out.println("Case 10 got executed !");
			System.out.println(a+" : value is a");
			break;
			
		case 200-180:
			System.out.println("Case 20 got executed !");
			System.out.println(a+" : value is a");
			break;
			
		case 40:
			System.out.println("Case 30 got executed !");
			System.out.println(a+" : value is a");
			break;
			
		case 'A':
			System.out.println("Case 40 got executed !");
			System.out.println("int and char are compatible ");
			System.out.println(a+" : value is a");
			break;
			
		case 50:
			System.out.println("Case 50 got executed !");
			System.out.println(a+" : value is a");
			break;
		
		}
		System.out.println("compiler come out the switch case :");
	}
	public static void main(String[] args) {
		SwitchCase obj = new SwitchCase();
		obj.meth1();
	}

}


/*Switch Case :=
 * unlike if-else  for switch we will be having multiple possible execution.
 * switch(key)
 * {
 * case label1:
 * -----------;
 * -----------;
 * case label2:
 * -----------;
 * ----------;
 * case label3:
 * ----------;
 * ----------;
 * }
 * 
 * 1.key value matches the particular label value .
 *2. up to java 1.4v switch accepts only byte,short, int & char.
 *3. for java 1.5v onward switch started accepting their perspective wrapper classes also.
 *4. for java 1.7v onwards switch started accepting String also.
 *5. In switch case writing case labels, default case & including break statement is optical
 * 6.If we are not writing break statement  from which  case label got trigged , from that onward all the 
 * case will executed .
 *7. Default case will be executed only if no case label is matched with key value.
 *8. we can write default case anywhere inside  the switch, it will be getting executed only if 
 * no case label is triggered.
 *9. duplicate case labels are not allowed in switch.
 * 10.Every statement present  inside switch should  belongs to a particular case otherwise we will
 * getting a compile time error.
 * 11.every statement present inside switch should belongs to a particular, otherwise we will be getting an c.e.
 * 12.Case label value should be  with in the range of the key data type.
 * 13.expression are also allowed in switch.(at key & label also).
 * 14. Key value and case label values should be compatible .
 * 15. in switch, case labels should be compile time constant.
 * 
 * 
 * 
 */


    

