package math;
//import java.math.*;
public class PrintNumber {

	public static void main(String[] args) {
		System.out.println("Printing numbers from 1 to 100:");
		for(int i=1;i<=100;i++)
		{	System.out.print(i+" "); // loop for printing numbers
		}
		System.out.println();
			
		
		int arry[]= new int[100];
		for (int i = 0; i<arry.length; i++)// loop for putting numbers into array.

		{
                arry [i] = i+1;
		}
		
		System.out.println("Here is all odd numbers:");
		for (int j = 0; j < arry.length; j=j+2) // loop for finding odd numbers

		{
			System.out.print(arry[j ] + " ");// printing odd numbers
		}	

		
		System.out.println(" ");
		System.out.println("Here is total number of array:");
                int total = 0;

        		for(int n =0; n<arry.length; n++) //loop for adding numbers from array

        			{total = total + arry[n];}

        		System.out.println(total); // printing the total number from array

        				
 
}	
}