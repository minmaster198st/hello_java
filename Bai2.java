package ifelse;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char input = sc.next().charAt(0);

        switch (input) {
            case 'A':
            case 'a':
                System.out.println("Ada");
                break;

            case 'B':
            case 'b':
                System.out.println("Basic");
                break;

            case 'C':
            case 'c':
                System.out.println("Cobol");
                break;

            case 'D':
            case 'd':
                System.out.println("dBase III");
                break;

            case 'F':
            case 'f':
                System.out.println("Fortran");
                break;

            case 'P':
            case 'p':
                System.out.println("Pascal");
                break;

            case 'V':
            case 'v':
                System.out.println("Visual C++");
                break;

            default:
                System.out.println("Invalid input!");
        }

        sc.close();
    }
}

