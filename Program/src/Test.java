
public class Test {
	
	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  System.out.println(n);
		  for (int i = 0; i < n / 2; ++i) { // n / 2 is right-leaning
			  System.out.println("::i:::"+i);
		    int j = n - i - 1;
		    System.out.println(">>>j:"+j);
		    System.out.println(":::::::::::IIIII==="+s.charAt(i));
		    System.out.println("::JJJJJJJJJJJ==="+s.charAt(j));
		    if (s.charAt(i) != s.charAt(j)) return false;
		  }
		  return true;
		}

	public static void main(String[] args) {

	String a = "racecar"	;
	System.out.println(isPalindrome(a));
	}

}
