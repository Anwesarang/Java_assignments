package Java_assignments.P;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of rows:");int i = sc.nextInt();
    System.out.print("Enter the no of columns:");int j = sc.nextInt();
    System.out.println("Enter the first matrix:");
    int arr1[][] = new int[i][j];
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            arr1[a][b] = sc.nextInt();
        }
    }
    System.out.println("Enter the second matrix:");
    int arr2[][] = new int[i][j];
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            arr2[a][b] = sc.nextInt();
        }
    }
    System.out.println("The first matrix:");
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            System.out.print(arr1[a][b] + " ");
        System.out.println();
        }
    }
    System.out.println("The second matrix:");
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            System.out.print(arr2[a][b] + " ");
        }
        System.out.println();
    }
    int sum[][] = new int[i][j];
    System.out.println("Sum of two matrix:");
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            sum[a][b] = arr1[a][b] + arr2[a][b];
        }
    }
    for(int a = 0; a < i; a++ ){
        for(int b = 0; b < j ;b++){
            System.out.print(sum[a][b] + " ");
        }
        System.out.println();
    }
    sc.close();
    }
}
