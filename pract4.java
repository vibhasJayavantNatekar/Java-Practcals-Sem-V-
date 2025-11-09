import java.util.Scanner;
public class pract4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a first number :");
        int first = obj.nextInt();

        System.out.println("Enter second number :");
        int second = obj.nextInt();

        int sub = first - second;

        System.out.println("Subtraction is :" + sub);
        
    }
}
