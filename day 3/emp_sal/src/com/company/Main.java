package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("enter birth year");
        int year=sc.nextInt();
        System.out.println("enter birth month");
        int month=sc.nextInt();
        System.out.println("enter birth date");
        int date=sc.nextInt();
        System.out.println("enter current year");
        int current_year=sc.nextInt();
        System.out.println("enter current month");
        int current_month=sc.nextInt();
        System.out.println("enter current date");
        int current_date=sc.nextInt();
        System.out.println("enter monthly salary");
        int sal=sc.nextInt();
        salary s=new salary(year,month,date,current_date,current_month,current_year,sal);
        System.out.println("name :"+name);
        s.age();
        s.tax();
    }
}
