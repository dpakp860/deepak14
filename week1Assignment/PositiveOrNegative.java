package assign.week1Assignment;
import java.util.*;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number ");
	    //Get the number from the user
	    int num = sc.nextInt();
        //if it is greater than zero it is positive or else it is negative
		if (num >= 0 ){
		    System.out.println(num + " is a positive number ");
		}
		else{
		    System.out.println(num + " is an negative number ");
		}

	}

}
