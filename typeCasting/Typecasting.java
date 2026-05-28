public class Typecasting {
	void implicit() {
		System.out.println("performing implicit type casting");
		byte b=50;
		int i=b;
		System.out.println("byte value ====>"+b);
		System.out.println("int value ====>"+i);
		
		char C1 ='A';
		int x = C1;
		
		char C2 = 'a';
		int y = C2;
		
		System.out.println("char 1 value ===>"+C1);
		System.out.println("int value ===>"+x); // ACSII
		
		System.out.println("char 2 value ===>"+C2);
		System.out.println("int value ===>"+y);
		
		// int and char data type both are Compatible
		
		System.out.println("meth1()  is returning ====>"+new Typecasting().meth1('a'));
	}
	
	int meth1(int a) {
		System.out.println("meth1() called "+(a+3));
		return 'A';
	}
	
	void explicit() {
		
		System.out.println("performing explicit type casting");
		
		int x = 500;
		byte b =(byte)x; // byte range -128 t0 127
		System.out.println("int value ====>"+x);// 500
		System.out.println("byte value ===>"+b);
		
		// minimum range  + (result - maximum range -1)
		// -128 +(500 -127 -1) ====> -128+372===>244
		//-128+(244-128) ===> + 128+116 ===> -12
		
		float f = 10.999f;
		byte b2= (byte)f;
		System.out.println("float value ====>"+f); // 10.999f
		System.out.println("byte value ====>"+b2); // 10
	}
	
	public static void main(String[] args) {
		Typecasting obj = new Typecasting();
		obj.implicit();
		System.out.println("****************#############******************");
		obj.explicit();
		
	}

}




/*
 * Type Casting =>
 * converting one data type into another data type [except boolean].
 * there are two type of type casting :==
 * 1. implicit type casting [smaller data ======> larger data ] widening
 *  i) implicit type casting done by the compiler automatically.
 *  ii) there is no chance of loss information.
 * 2. explicit type casting [ larger data ======> smaller data] narrowing
 *  i) explicit type casting will not be perform by the compiler,
 *     it is the responsibility of the programmer.
 *  ii) there may be chance of loss of information
 * 
 */


    

