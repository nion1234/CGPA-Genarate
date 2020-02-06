package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Any numer:");
	num=input.nextInt();
	if(num%2==0){
	    System.out.println("The Number is Even."+" "+num);

        }
	else{
	    System.out.println("The number is odd."+" "+num);
    }
    }
}
