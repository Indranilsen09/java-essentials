package java_Hackerrank;

import java.util.Scanner;

/*A subarray of an -element array is an array composed from a contiguous block of the original array's elements.
 *  For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.
*/

public class java_SubArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//entering array length
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//entering array element
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int sum =0; //int for holding sum of subarray's element
		int count=0;// count of (-)ve sum
		for(int i =0; i<arr.length; i++) 
		{
			for(int j =i; j<arr.length; j++) {
				
				for (int k =i; k<=j; k++) 
				{
					//printing all the subArrays
					System.out.print(arr[k]+"\t");
					sum += arr[k];
				}
				System.out.println();
				if(sum<0) {
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}
