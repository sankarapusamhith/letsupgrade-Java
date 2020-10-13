package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        int s1,s2,s3,s4,s5,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter s1 marks");
        s1=sc.nextInt();
        System.out.println("enter s2 marks");
        s2=sc.nextInt();
        System.out.println("enter s3 marks");
        s3=sc.nextInt();
        System.out.println("enter s4 marks");
        s4=sc.nextInt();
        System.out.println("enter s5 marks");
        s5=sc.nextInt();
        student s= new student(s1,s2,s3,s4,s5);
        s.display();

    }
}
