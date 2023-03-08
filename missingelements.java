package week3.day2;

public class missingelements {
	public static void main(String[] args) {
		int a[]= {1,4,7,2,3,6};
		int b=0,c=0;
		for (int i = 0; i <8; i++) {
			b=b+i;
		}
		for (int j = 0; j < a.length; j++) {
			c=c+a[j];
		}
		int d=b-c ;
		{
			System.out.println(d);
		}
	}

}
