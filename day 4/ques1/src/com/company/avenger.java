package com.company;

import java.util.Scanner;

public class avenger {
    public int age;
    public String name,weapon,power,planet;
    Scanner sc = new Scanner(System.in);
    public void getdetails() {

        System.out.println("enter name :");
        name = sc.nextLine();
        System.out.println("enter age :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter power:");
        power = sc.nextLine();
        System.out.println("enter weapon");
        weapon = sc.nextLine();
        System.out.println("enter planet");
        planet = sc.nextLine();
    }


    public void displaydetails()
    {
        System.out.println("name is :"+name);
        System.out.println("age is :"+age);
        System.out.println("power is :"+power);
        System.out.println("weapon is :"+weapon);
        System.out.println("planet is :"+planet);

    }


}
