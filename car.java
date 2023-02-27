package selenium;

public class car {
	 public void openDoor() {
		 System.out.println("Door opened");
	}
	 public void closeDoor() {
		 System.out.println("Door closed");
	 }
	 public void insertKey() {
		 System.out.println("Key inserted");
	 }
	 public void power() {
		 System.out.println("car started");
	 }
	 public void holdSteer() {
	 	 System.out.println("car Turns");
	 }
	 
	 public static void main(String[]args) {
		 car mycar = new car();
		 mycar.openDoor();
		 mycar.closeDoor();
		 mycar.insertKey();
		 mycar.power();
		 mycar.holdSteer();
	 }
	}




