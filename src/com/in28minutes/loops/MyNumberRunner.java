package com.in28minutes.loops;

import com.in28minutes.loops.MyNumber;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber num = new MyNumber(5);

        boolean isPrime = num.isPrime();
        System.out.println("This number is Prime? " + isPrime);

        int sum = num.sumUptoN();
        System.out.println("The sum up to number is " + sum);

        int sumOfDivisors = num.sumOfDivisors();
        System.out.println("The sum Of Divisors is " + sumOfDivisors);

        num.printNumberTriangle();
    }
}
