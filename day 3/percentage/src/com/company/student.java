package com.company;

public class student {
    int s1,s2,s3,s4,s5,i;
    student(int s1, int s2, int s3, int s4, int s5) {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;
    }

    public void display()
    {
        float t=s1+s2+s3+s4+s5;
        float p=(t/500)*100;
        if(p>=90)
            System.out.println("grade A");
        else if(p>=70 && p< 90 )
            System.out.println("grade B");
        else if(p>=50 && p< 70)
            System.out.println("grade c");
        else
            System.out.println("fail");

    }


}