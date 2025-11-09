import java.util.Scanner;
public class pract7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number :");
        int first = obj.nextInt();

        System.out.println("Enter second number :");
        int second = obj.nextInt();

        int division = first/second;

        System.out.println(division);
    }
}
