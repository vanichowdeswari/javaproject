package chowdeswari;

 interface message{
	 void say();
 }
 public class LambdaExample{
	 
	 public static void main(String[] args) {
		 message hellomessage=()-> System.out.println("This is Lambda ");
		 hellomessage.say();
	 }
 }