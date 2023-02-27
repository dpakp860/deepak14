public class Mobile {
 public void unlock() {
	 System.out.println("switch on");
}
 public void passcode() {
	 System.out.println("insert pin");
 }
 public void camera() {
	 System.out.println("take pic");
 }
 public void contact() {
	 System.out.println("call anyone");
 }
 public void message() {
 	 System.out.println("text anyone");
 }
 public static void main(String[]args) {
	 Mobile mob = new Mobile();
	 mob.unlock();
	 mob.passcode();
	 mob.camera();
	 mob.contact();
	 mob.message();
 }
}

