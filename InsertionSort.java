/*
 * #Task-12: WAP to implement insertion sort on an array
 * Registration ID: JIRSS1132
 * Name : Bipin Kumar
 */
package ArrayAndClassObjects;
import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------Insertion Sort-------");
		System.out.println("How many number to be sorted : ");
		// variable to store number of elements to be sorted
		int num=sc.nextInt();
		// array with size num to store all elements
		int arr[]=new int[num];
		System.out.println("Enter "+num+" numbers to sort");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();//input all elements by user
		}
		
		// Logic for Insertion sort
		for(int j=1;j<arr.length;j++) {
			 int loc=arr[j];// local variable to store jth element of array
			 int  k=j-1; // local variable to store j-1th index of array
			 
			while(k>=0&&arr[k]>loc)// check whether k>=0 and element at kth position is greater than loc 
			{
				arr[k+1]=arr[k];// move element at kth position to one position backward
				k=k-1;
			}
			arr[k+1]=loc;
		}
		for(int x:arr)
		{ 	// print elements of sorted array
			System.out.println(x);
		}
		sc.close();
	}
	
}
