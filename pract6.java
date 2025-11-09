import java.util.Scanner;
public class pract6 {
    int fact(int n){
        int fact =1;
        if(n==0||n==1){
            return fact;
        }
        for(int i =1;i <= n;i++){
            fact *=i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number to calculate factorial :");
        int num = obj.nextInt();

        pract6 factorial = new pract6();

        System.out.println("Factorial of " + num  + " is :" + factorial.fact(num));

        
    }
}
