import java.util.Scanner;
public class pract2 {

     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int first = obj.nextInt();

        System.out.println("Enter a Second number :");
        int second = obj.nextInt();

        int addition = first + second;
        System.out.println("The Addition of two numbers : " + addition);


     }
}