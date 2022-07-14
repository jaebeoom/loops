package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;

        do {
            if (num != -1) {
                System.out.println("Cube is " + (num * num * num));
            }
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        } while (num >= 0);
        System.out.print("Thank you! Have Fun!");
    }
}
