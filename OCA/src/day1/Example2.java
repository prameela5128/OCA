package day1;

public class Example2{
		public static void main(String[] args){
			doStuff();
			}
		public static void doStuff(){
			doMoreStuff();
			}
		public static void doMoreStuff(){
			System.out.println(10/0);
			}
	}






/* output: 
Exception in thread "main" java.lang.ArithmeticException: / by zero
 */