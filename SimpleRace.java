package chowdeswari;

class Car extends Thread{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println("car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
}
class Bike extends Thread{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println("Bike  moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}

	}
}
}
public class SimpleRace {
	public static void main(String[] args) {
		new Car().start();
		new Bike().start();
	}
		

}