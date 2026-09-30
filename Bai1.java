package ifelse;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter salary: ");
    double salary = sc.nextDouble();   
    System.out.print("Enter grade: ");
    char grade = sc.next().charAt(0);
    double allowance;
    if (grade == 'A' || grade == 'a') {
    allowance = 300;
    } else if (grade == 'B' || grade == 'b') {
    allowance = 250;
    } else {
    allowance = 100;
    }

    double totalSalary = salary + allowance;

    System.out.println("Salary at the end of the month: " + totalSalary);
    }
}
