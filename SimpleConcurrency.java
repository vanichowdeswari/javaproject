package chowdeswari;
class MyTask extends Thread{
	private String taskName;
	public MyTask(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskName+"Steps"+i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println(taskName+"was interrupted");
			}
		}
	}
}
public class SimpleConcurrency {
	public static void main(String[] args) {
		MyTask t1=new MyTask("cooking");
		MyTask t2=new MyTask("washing");
		t1.start();
		t2.start();
	}
}