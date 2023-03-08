package week3.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
        String test = "I am a software tester";
        String[] arr = test.split(" ");
        for (int i = 0; i < arr.length; i++) {
           // System.out.print(arr[i]+" ");
            if (i % 2 != 0 ){
                //System.out.println(arr[i]);
               StringBuilder str = new StringBuilder(arr[i]);
               arr[i] = String.valueOf(str.reverse());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
