package chowdeswari;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name =sc.nextLine();
		
		System.out.println(name+age);
		// TODO Auto-generated method stub

	}

}