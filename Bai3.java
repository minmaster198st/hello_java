package ifelse;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        int difference = number1 - number2;
        if(difference == number1){
            System.out.println("Difference is equal to value number1");
        }else if(difference == number2){
            System.out.println("Difference is equal to value number2");
        }else{
            System.out.println("Difference is not equal to any of the values entered");
        }
    }
}
