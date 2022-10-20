
public class StringCompression {

	
	public static String stringBuilderSolution(String str) {
	    int length = str.length();
	    char current = str.charAt(0);
	    int count = 0;
	    StringBuilder compressed = new StringBuilder();

	    for (int i = 0; i < length; i++) {
	      char c = str.charAt(i);
	      System.out.println(":"+c);
	      if (c == current) {
	        count++;
	      } else {
	    	  
	        compressed.append(current).append(count);
	        
	        current = c;
	        count = 1;
	      }
	    }
	    compressed.append(current).append(count);

	  //  return compressed.length() < length ? compressed.toString() : str;
	    return compressed.toString();
	  }
	
	public static void main(String[] args) {
		
		String input = "aab";
		System.out.println(stringBuilderSolution(input));

	}

}

