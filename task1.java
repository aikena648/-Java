package com.javarush.test;
/* Нужно посчитать сумму трехзначного числа методом sumDigitsInNumber */

public class task1 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(875));
    }
    public static int sumDigitsInNumber (int number) {
        int r3 = number /100;
        int r2 = (number - (r3*100)) /10;
        int r1 = number - (r3*100) - (r2*10);
        int s = r3+r2+r1;
        return s;
    }
}
