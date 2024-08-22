package Java_assignments;
import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int fact = 1;
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println("The factorial of the number:"+fact);
        sc.close();
    }
}
