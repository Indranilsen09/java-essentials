package java_Mathaematics;

import java.util.Scanner;

public class CountDigitsinNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =0;
		while(n!=0) {
			n = n/10;
			i++;
			
		}
		
		System.out.println("Digits in the input number"+n+" is :- "+ i);
	}

	}


