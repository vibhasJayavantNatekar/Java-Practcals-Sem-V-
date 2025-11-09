import java.util.Scanner;

public class pract10 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = obj.nextInt();
        if(num <=1){
            System.out.println("Not a Prime Number.");
        }else{
            boolean isPrime = true;

            for(int i =2;i<=num/2;i++){
                if(num%i == 0){
                    isPrime =false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("Prime number .");
            }else{
                System.out.println("Not Prime number .");
            }
        }
    }
    
}
