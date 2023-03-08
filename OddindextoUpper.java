package week3.day2;

public class OddindextoUpper {
	public static void main(String[] args) {
		String a ="changeme";
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if (i % 2 != 0) {
			b[i] = Character.toUpperCase(b[i]);}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}
}
