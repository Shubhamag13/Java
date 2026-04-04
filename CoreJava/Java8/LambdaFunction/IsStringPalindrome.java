package com.lambdaexpression;

interface Pal{
	Boolean IsPalindrome(String str);
}

public class IsStringPalidrome {

	public static void main(String[] args) {
		Pal p = str->{
			StringBuffer str1=new StringBuffer(str);
			StringBuffer sb = new StringBuffer(str).reverse();
			
			if(str1.toString().equals(sb.toString())) return true;
			return false;
		};
		
		System.out.println(p.IsPalindrome("MAA"));
	}
}
/* 
Pal p = str -> {
    int i = 0, j = str.length() - 1;
    while (i < j) {
        if (str.charAt(i) != str.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
};
*/

/*
 *  Pal p = str -> {
            // Step 1: Create an empty reversed string
            String reversed = "";

            // Step 2: Loop from end to start
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed = reversed + str.charAt(i);
            }

            // Step 3: Compare original with reversed
            return str.equals(reversed);
        };


*/
