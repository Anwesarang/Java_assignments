package Java_assignments;
import java.util.Scanner;
public class oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if( n % 2 == 0){
            System.out.println("The number "+n+" is even.");
        }else{
            System.out.println("The number "+n+" is odd.");
        }
        sc.close();
    }
}