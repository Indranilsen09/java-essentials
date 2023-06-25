package java_Hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class java_BigDecimal {
	
	
	 /* Given an array,s , of n real number strings, sort them in descending order —
	 * but wait, there's more! Each number must be printed in the exact same format
	 * as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is
	 * printed as 0.1. If two numbers represent numerically equivalent values (e.g:
	 * .1=0.1 ), then they must be listed in the same order as they were received as
	 * input). Complete the code in the unlocked section of the editor below. You
	 * must rearrange array s's elements according to the instructions above.
		
	Sample Input 		Sample Output
					
	-100 				90
	50					56.6
	0					50
	56.6				02.34
	90					0.12
	0.12				.12
	.12					0
	02.34				000.000
	000.000				-100
	 
	 */
	
	
	public static void main(String[] args) 
	{
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n+2];
		
		for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Comparator<String> myCustomComparator = new Comparator<String>() 
        {
        	@Override
        	public int compare(String o1, String o2) 
        	{
        		BigDecimal b1 = new BigDecimal(o1);
        		BigDecimal b2 = new BigDecimal(o2);
        		
        		return(b2.compareTo(b1));
        	}
        	
        };
        
        Arrays.sort(s,0,n,myCustomComparator);
        
      //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

	}


