package study;

import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of 5 subjects");
		
		float a = sc.nextFloat();
		
		float b = sc.nextFloat();
		
		float c = sc.nextFloat();
		
		float d= sc.nextFloat();
		
		float e = sc.nextFloat();
		
		float tmarks = 500;
		
		//float avg =(a+b+c+d+e)/5;
		
		float sum = a+b+c+d+e;
		
		float per= (sum/tmarks)*100;
		
		System.out.println("Percentage obtained by student  is : " +per);
		
		
		

	}

}
