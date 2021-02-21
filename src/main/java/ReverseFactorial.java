package com.simpleprojects;

public class ReverseFactorial {

    public static void main(String args[]) {

        int divider = 1;
        int number = 120;

        while (divider < number) {
            int result = (number / divider);
            while (true) {
                result /= divider;
                divider++;
                if (result == divider) {
                    System.out.println(divider + "!");
                    break;
                }
                if (result < divider){
                    System.out.println("NONE");
                    break;
                }
            }
            break;
        }

    }
}