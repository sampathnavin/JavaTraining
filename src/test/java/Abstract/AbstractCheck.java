package Abstract;

import java.util.Scanner;

public class AbstractCheck {

	public static void main(String[] args) {
		
		VotingCheck mm = new VotingCheck();
		mm.age();
		mm.aadhar();
		mm.photovalidation();
		
		Scanner bs = new Scanner(System.in);
		System.out.println("Enter Valid age");
		
		int age = bs.nextInt();
		System.out.println("Enter valid aadhar");
		int aadhar = bs.nextInt();
		System.out.println("Enter Valid driver licence");
		int photoid = bs.nextInt();
		if(age>=18 && aadhar==12 && photoid ==16 ) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("you can't vote");
		}
		
		

	}

}
