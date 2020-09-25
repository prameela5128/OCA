package day1;

public class Example3 {
	public static void main(String[] args){
		System.out.println("statement1");
		System.out.println(10/0);System.out.println("statement3");
		}
}







/* output:
statement1
Exception in thread "main" java.lang.ArithmeticException: / by zero
*/