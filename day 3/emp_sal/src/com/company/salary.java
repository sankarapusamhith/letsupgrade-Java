package com.company;

public class salary {
    String name;
    int year,month,date,sal,current_date,current_month,current_year;
    salary(int year , int month, int date ,int current_date,int current_month, int current_year, int sal)
    {
        this.year=year;
        this.month=month;
        this.date=date;
        this.sal=sal;
        this.current_date=current_date;
        this.current_month=current_month;
        this.current_year=current_year;
    }
    public void age()
    {
        int[] mon = { 31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31 };
        if (date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + mon[month - 1];
        }
        if (month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }
        int calculated_date = current_date - date;
        int calculated_month = current_month - month;
        int calculated_year = current_year - year;
        System.out.println("Age :"+calculated_year+"years "+ calculated_month+"months "+calculated_date+"days");
    }
    public void tax()
    {
        double a_sal=sal*12;
        System.out.println("Annual Salary :"+a_sal);
        if(a_sal>=500000)
            System.out.println("tax amount :"+(a_sal*0.02));
        else if(a_sal>=400000 && a_sal<500000)
            System.out.println("tax amount :"+(a_sal*0.02));
        else if(a_sal>=300000 && a_sal<400000)
            System.out.println("tax amount :"+(a_sal*0.02));
        else if(a_sal>=200000 && a_sal<300000)
            System.out.println("tax amount :"+(a_sal*0.02));
        else
            System.out.println("no tax");
    }
}
