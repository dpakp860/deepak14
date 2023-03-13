package assign.week1Assignment;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
			
			//Declare a variable and get value using scanner class
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			
			//checks if the number%2 is equal to zero
			if(number%2==0)
			{
				System.out.println("It is a even number");
			}
			else
			{
				System.out.println("It is a odd number");
			}
			

	}

}
