package chowdeswari;

class Cal{
	int add(int a,int b ) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
}
public class overloading {

	public static void main(String[] args) {
		Cal c=new Cal();

		System.out.println(c.add(10,20));
		System.out.println(c.add(1234,3456));
		System.out.println(c.add(10.234,20.234));
	}

}