
public class logic {
	
//	
//	 public String toLongScale(long n) {
//	        return toText(Long.toString(n), new String[] {
//	            "", "thousand", "million", "milliard", "billion", "billiard", "trillion", "trilliard"
//	        });
//	    }
//
//	    public String toShortScale(long n) {
//	        return toText(Long.toString(n), new String[] {
//	            "", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion", "sextillion"
//	        });
//	    }
//	
//	    public int sample() {
//	    	
//			int n = 34555;
//			
//			int length = (int)	(Math.log10(n)+1);
//			
//			
//			if (length >=2) {
//				System.out.println("The length of " + n + " is " + length);
//			}
//			else {
//				System.out.println("Please enter valid number");
//			}
//				
//				return n;
//				
//			
//			
//		}
	
		static long n = 12435l;
    	
    	static String StrN = "" + n;
    	
    

    	public  void shortScale() {
			
	    	if (StrN.length() >= 7) {
	    		System.out.print("Shortcale:  " + (StrN.substring(0,1)) + " trillion ")  ;
	    	}else {
	    		System.out.println("Please put valid number");
	    	}
	    	
	    	if (StrN.length() >=6) {
	    		System.out.print(StrN.substring(1,3) + " billion");
	    	} else {
	    		System.out.println("Please put valid number");
	    	}
	    	if (StrN.length() >=5) {
	    		System.out.print( " " + StrN.substring(StrN.length()) + " million");
	    	}
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	
	    	if (StrN.length() >=3) {
	    		System.out.print(" " + StrN.substring(StrN.length()) + " thousand");
	    	} 
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	 if (StrN.length() >= 0 ) {
	    		System.out.println(" " + StrN.substring(StrN.length()));
	    	}else {
	    		System.out.println("Please put valid number");
	    	}
	    	}
	    public void longScale() {
	    	if (StrN.length() >= 7) {
	    		System.out.print("Longscale:  " + (StrN.substring(0,1)) + " billion ")  ;
	    	}
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	
	    	if (StrN.length() >=6) {
	    		System.out.print(StrN.substring(1,3) + " milliard");
	    	} else {
	    		System.out.println("Please put valid number");
	    	}
	    	
	    	if (StrN.length() >=5) {
	    		System.out.print( " " + StrN.substring(3,6) + " million");
	    	}
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	if (StrN.length() >=3) {
	    		System.out.print(" " + StrN.substring(7,10) + " thousand");
	    	}
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	if (StrN.length() > 0 ) {
	    		System.out.println(" " + StrN.substring(StrN.length()));
	    	}
	    	else {
	    		System.out.println("Please put valid number");
	    	}
	    	
	    	}

}


	
	

	
	
