
public class TestProgram {

	public static void main(String[] args) {
		/*
		 * 
		 * String str = "aba"; String rev = "" ;
		 * 
		 * for(int i = str.length()-1;i>=0;--i) { rev = rev + str.charAt(i); }
		 * 
		 * System.out.println(rev);
		 * 
		 * if (str.equalsIgnoreCase(rev)) { System.out.println("PALLINDROME"); }
		 */
		
		String a = "racecar";
		System.out.println(checkPalReverse(a));
		
		  String str = "Too hot to hoot.";
	        if( sentencePalindrome(str))
	        System.out.println("Sentence is palindrome");
	        else
	        System.out.println("Sentence is not" + " " +
	                                        "palindrome");
	
	}
	
	static boolean sentencePalindrome(String s)
    {
        if(s.isEmpty())         // if String s is empty return true
        return true;
     
    String str = s.toLowerCase();// convert the whole string into lower case alphabet
     
    //remove non-alphanumeric characters
    // replace the given string with empty string except the pattern [^a-zA-Z0-9]
    str = str.replaceAll("[^a-zA-Z0-9]", "");
     
    //The reverse() method of StringBuilder is used to reverse the characters in the StringBuilder.
    StringBuilder revstr = new StringBuilder(str);
    revstr.reverse();
    String rstr = revstr.toString();
     
    if(str.equals(rstr))//if string and reversed string both are equal return true
        return true;
     
    return false;               //else return false
     
}
	public static boolean checkPalReverse(String str) {
		
		int len = str.length();
		System.out.println("::::"+len);
		if(len == 0 || len ==1)
		{
			System.out.println("TRUEEEEE");
			return true;
		}
		StringBuilder rev = new StringBuilder(str);
		String nn = rev.reverse().toString();
		if(nn.compareToIgnoreCase(str)== 0)
		{
			return true;
		}
		
		return false;
		
	}
	
	

}
