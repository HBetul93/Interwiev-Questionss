package javapractise;

public class Palindrome {

	public static void main(String[] args) {
		
		
		/*  Quest Palindrome   Create a program checks if a string is palindrome or not    */
		
//		StringBuilder stb = new StringBuilder (); // it is an object and in the Heap memory
//		
//		stb.append("Ibrahim");
//		
//		System.out.println(stb.equals(stb.reverse())); // True. Because Strings are immutable
//		
//		System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString())); // on this way we compare their values. So it gives us "false"
//		// Object says, if its part of me, yes its me. but String says no, its not me.
//		
// Palindrome : for ex "civic" "radar" 
		
		
		String name = "Ibrahim";
		
	}
	
	
	public static void palindrome(String name) {
		
		String reversed= "";
		
		for(int i = name.length()-1; i>=0; i--) {

			
			reversed += name.charAt(i);
	
			
		}
		
	if(name.equalsIgnoreCase(reversed)) {
		System.out.println("This word is a palindrome!" + name);
				
		}else {
			System.out.println("This word is not a palindrome!" + name);
		}
		
		
	}
	
	
}
