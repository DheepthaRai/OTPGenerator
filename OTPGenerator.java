package Basics;

import java.util.Random;
import java.util.Scanner;

public class OTPGenerator {
	
	public static int OTP;
	
	public static void RandomGen() {
		Random rand = new Random();
		OTP = rand.nextInt(100000);
		System.out.println("Your OTP is: " +OTP);
	}
	
	public static void main(String args[]) {
		char yn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to generate an OTP?\nPlease say y or n");
		yn = sc.next().charAt(0);
		if(yn=='y')
			RandomGen();
		else if(yn=='n')
			System.out.println("Thank you for trying out my program. Have a good day!");
		else
			System.out.println("I'm sorry. Your response is not in accordance with what we could process :/");
	}

}
