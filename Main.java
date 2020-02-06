package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float a,b;
	Scanner input1=new Scanner(System.in);
	Scanner input2=new Scanner(System.in);
	System.out.print("Enter Your area:");
	a= input1.nextFloat();
	System.out.print("Enter Another area:");
	b=input2.nextFloat();
	System.out.println("Your area is :"+" "+a*b);


    }
}
