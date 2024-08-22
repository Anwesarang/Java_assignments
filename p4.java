package Java_assignments;
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.:");
        int n = sc.nextInt();
        int d,rev,sum;
        d = 0;sum =0;rev = 0;
        while(n > 0){
            d = n % 10;
            sum = sum + d;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        System.out.println("The sum of digit: "+sum);
        System.out.println("The reverse of digit:"+rev);
        sc.close();
    }
}
