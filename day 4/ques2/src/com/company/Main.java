package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers");
        for (int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        System.out.println("odd numbers :");
        for (int i=0;i<5;i++)
        {
            if((arr[i]%2)!=0)
                System.out.println(arr[i]);
        }
    }
}
