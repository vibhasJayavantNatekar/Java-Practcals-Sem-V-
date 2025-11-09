public class pract9 {
    public static void main(String[] args) {
        
        int a =0 ,b =1;
        System.out.println(a);
        System.out.println(b);

        int c = a + b;

        while (c <= 20) {
            System.out.println(c);
            a = b ;
            b = c;
            c = a + b;
        }
    }
}
