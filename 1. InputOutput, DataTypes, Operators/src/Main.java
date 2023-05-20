import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        1. Print the following text in the output:
        Hello

        World !
        Note: There is a empty line you need print between Hello and World !
        */
        System.out.println("Hello");
        System.out.println();
        System.out.println("World !");

        /*
        2. Print the following pattern in output
        *****
        ****
        ***
        **
        *
        Print the following pattern in 5 lines with 5, 4, 3, 2, 1 stars in each line
        */
        for(int i=0; i<5; i++){
            for(int j=i; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        3. Print the following pattern in output
             *
            **
           ***
          ****
         *****
         Print the following pattern in 5 lines with 4 spaces and 1 star, 3 spaces and 2 stars, 2 spaces and 3 stars, 1 spaces and 4 stars, 0 spaces and 5 stars in respectively lines
         */
        int i,j,k;
        for(i=0; i<5; i++){
            for(j=i+1; j<5; j++){
                System.out.print(" ");
            }
            for(k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        4. Perform the following operations on 6 and 3 and print their respective outputs in different lines.
            1. Addition
            2. Subtraction
            3. Multiplication
            4. Division
            Print the output of 6+3, 6-3, 6*3, 6/3 in separate lines.
            Example Output
                9
                3
                18
                2
         */
        System.out.println(6+3);
        System.out.println(6-3);
        System.out.println(6*3);
        System.out.println(6/3);
        /*
        5. Given total bills amount and amount of a single bill. Print number of bills.
        Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.
        Input : The first line contains a real number N denoting the total budget.
        The second line contains an integer M denoting the value of a single bill.
        Output: Print in a single line denoting the total number of bills that can fit in the total budget.
        Input:-
        126.3
        5
        Output:-
        25
         */
        Scanner scn  = new Scanner(System.in);
        double N = scn.nextDouble();
        int M = scn.nextInt();
        int bills = (int)(N/M);
        System.out.print(bills);
        /*
        6. Take an input of single sentence, single word, single character, an integer, a float value, a double value in the given order.
        Input:
        I am Ram,
        sita
        a
        1
        hanuman
        3.14
        9.888887
         */
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        sc.nextLine();
        String s3 = sc.nextLine();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c);
        System.out.println(n);
        System.out.println(s3);
        System.out.println(f);
        System.out.println(d);
    }
}