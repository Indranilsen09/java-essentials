package java_Mathaematics;

import java.util.Scanner;

public class CountandReverseANumber {

	public static void main(String[] args) 
	{
		//Taking Number in Input from System
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//following the Single Responsibility Princible from Solid Principle, we have created
		//a Sepearate functions for each responsibility
		
		int nod = countNumberofDigits(n);
		System.out.println("Number of Digits Present in "+n+ "  IS :-" +nod);
		displayDigitsForward(nod, n);
		displayDigitsBackward(n);
		

	}
	
	static int countNumberofDigits(int n) 
	{
		int temp = n;
		int count = 0;
		while(temp!=0) 
		{
			temp=temp/10;
			count++;
		}
		return count;
		
	}
	
	static void displayDigitsForward(int n, int n1)
	{
		
		int exp = n;
		int div = (int) Math.pow(10, exp-1);
		int temp = n1;
		System.out.println("------------------------------------------");
		System.out.println("Displaying Digits of Number : Forward");
		while(div!=0) 
		{
			int q = temp/div;
			System.out.println(q);
			
			temp = temp%div;
			div =div/10;
		
		}
		
	}
	
	static void displayDigitsBackward(int n)
	{
		int temp = n;
		
		System.out.println("-------------------------------------------------");
		System.out.println("Displaying Digits of Number : Backward");
		while(temp!=0)
		{
			
			int q = temp%10;
			System.out.println(q);
			temp = temp/10;
			
		}
		
	}

}
