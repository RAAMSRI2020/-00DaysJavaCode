package com.conditionalsLoops;

class depreciation {
    public static void main(String[] args) {
        long amount = 100000;
        long deppercent = 10;
        long year = 3;
        long temp = amount;
        for (int i = 0; i < year; i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        System.out.println("After depreciation = " + temp);
    }
}
