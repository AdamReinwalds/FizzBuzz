package com.company;

public class Main {
    public static void main(String[] args) {
        for (int number = 1; number < 101; number++) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("buzz");
            }
            else if (number % 5 == 0) {
                System.out.println("fizz");
            }
            else{
                System.out.print(number + "\n");

            }
        }
    }
}
