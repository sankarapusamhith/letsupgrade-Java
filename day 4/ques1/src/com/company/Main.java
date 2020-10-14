package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        avenger[] av = new avenger[5];
        for (int i = 0; i < 5; i++) {
            av[i]=new avenger();
            av[i].getdetails();}
        for(int i=0;i<5;i++)
            av[i].displaydetails();

    }





}
