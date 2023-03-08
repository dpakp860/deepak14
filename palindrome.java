package week3.day2;

public class palindrome {
	public static void main(String[] args) {

			String a="madam";
			String b=" ";
			for (int i = a.length()-1; i >=0; i--) {
				b=b+a.charAt(i);
			}	
			System.out.println("Reverse of "+a+" is"+b);	
		if(a.equals(b))
			
		{
		    System.out.println(a+" is palindrome");
		}
		else{
		    System.out.println(a+" is not palindrome");
		}
	}}