package day1;

class Alien {
	
	//String invade(short ships) { 
	String invade(int i) { 
	return "a few";
	}
	String invade(short... ships) {
		return "many";
	}
}
public class Defender {
	public static void main(String [] args) {
		
		//System.out.println(new Alien().invade(7));
		System.out.println(new Alien().invade(7));
		}
	}






// compilation fails change method invade short to int