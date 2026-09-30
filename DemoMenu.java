package ifelse;

import java.util.Scanner;

public class DemoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Student manager");
            System.out.println("---------------------");
            System.out.println("1.Show student list.");
            System.out.println("2.Add  new student.");
            System.out.println("3.Update student information.");
            System.out.println("4.Delete student by rollnumber.");
            System.out.println("5.Search student by keyword.");
            System.out.println("0.Exist program.");
            System.out.println("---------------------");
            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Show student list!");
                    break;
                case 2:
                    System.out.println("Add  new student!");
                    break;
                case 3:
                    System.out.println("Update student information!");
                    break;
                case 4:
                    System.out.println("Delete student by rollnumber!");
                    break;
                case 5:
                    System.out.println("Search student by keyword!");
                    break;
                case 0:
                    System.out.println("See you later!");
                    break;
                default:
                    System.out.println("Invalid choice.Please enter number form 0 to 5.");
                    break;
            }
            if(choice==0){
                break;
            }
            System.out.println("Press c to continue!");
            sc.nextLine();
        }
    }
}
