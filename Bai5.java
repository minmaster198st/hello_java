package ifelse;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        if(x < 2000 || x > 3000){
            System.out.println("x = " + x);
        }
        if(y >= 100 && y <= 500){
            System.out.println("y = " + y);
        }
    }
}
