package ifelse;

import java.util.Scanner;

public class Bai4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter score: ");
    int score = sc.nextInt();
    if(score > 75){
        System.out.println("grade A");
    }else if(score > 60 && score < 75){
        System.out.println(" grade B");
    }else if(score > 45 && score < 60){
        System.out.println(" grade C");
    }else if(score > 35 && score < 45){
        System.out.println(" grade D");
    }else if( score < 35){
        System.out.println(" grade E");
    }

}
}
