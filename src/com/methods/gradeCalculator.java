package com.methods;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int mark= sc.nextInt();
        System.out.println(gradeCalculator(mark));
    }
    static String gradeCalculator(int mark){
        if(mark>90 && mark<=100)
            return "AA";
        else if(mark>80 && mark<=90)
            return "AB";
        else if(mark>60 && mark<=70)
            return "BB";
        else if(mark>50 && mark<=60)
            return "CD";
        else if(mark>40 && mark<=50)
            return "DD";
        else
            return "fail";
    }
}

/*
 Marks        Grade
91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail */