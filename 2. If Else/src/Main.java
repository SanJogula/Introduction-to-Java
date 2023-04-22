import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Given the number N, Categorise the number according to following condition :
            1. Odd-Positive
            2. Odd-Negative
            3. Even-Positive
            4. Even-Negative
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n==0){
            return;
        }

        if(n%2==0){
            if(n>0){
                System.out.println("Even-Positive");
            } else{
                System.out.println("Even-Negative");
            }
        }else{
            if(n>0){
                System.out.println("Odd-Positive");
            } else{
                System.out.println("Odd-Negative");
            }
        }
        /*
        2. Write a program that takes in a number N as input and does the following:
            if N is a multiple of 3, print Fizz
            if N is a multiple of 5, print Buzz
            if N is a multiple of both 3 and 5, print FizzBuzz
            Input Format: There is only 1 single line in the input, which is the integer N.
            Output Format: Print Fizz / Buzz / FizzBuzz depending on the value N.
         */
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        if(n%3 == 0 && n%5 == 0){ //if(n%15 == 0)
            System.out.println("FizzBuzz");
        } else if(n%3 == 0){
            System.out.println("Fizz");
        } else if(n%5 == 0){
            System.out.println("Buzz");
        }
    }
}