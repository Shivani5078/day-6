package comany;
import java.util.Scanner;
public class ReveseNumber {

		// TODO Auto-generated method stub
		  // method created for to get reverse number
		public static  void revNum(int number) {
			int reminder , reverse = 0;
			
			while(number != 0)
			{
				// get reverse number
				reminder= number % 10;
				reverse= reverse * 10 + reminder;
				number = number / 10 ;
			}		
				
				System.out.println("The Reverse of given number is " + reverse );
		}

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			   int num = sc.nextInt();
			   revNum(num);

		}

	}


