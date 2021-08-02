/* #Task13: Write a program to find how an amount can be using Indian currencies starts from 1000 notes
	and move downward.
	e.g. 9788 [1000*9, 500*1, 100*2, 50*1, 20*1, 10*1, 5*1, 2*1, 1*1]
    Registration ID:JIRSS1132
    Name: Bipin Kumar
*/
package ArrayAndClassObjects;
import java.util.Scanner;

public class AmountMadeByCurreny {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc=new Scanner(System.in);
		
		// variable to take input amount
		System.out.println("Enter amount: ");
		int amount=sc.nextInt();
		
		// take an array of currency in decreasing order
		int currency[]= {1000,500,100,50,20,10,5,2,1};// here 0->1000 1->500 2->100....8->1 rupees count
		
		// take an array to count each currency
		int currencyCount[]=new int[currency.length];
		
		// take temporary variable to store value of amount
		int temp=amount;
		
		// logic to count different currency
		for(int i=0;i<9;i++) {
			int value=temp/currency[i];
			if(value!=0) {
				currencyCount[i]=value;
				temp=temp%currency[i];
			}
		}
		
		for(int j=0;j<9;j++) {
			System.out.print(currency[j]+"*"+currencyCount[j]+", ");
		}
		sc.close();

	}

}
