package Java_assignments;
import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the no of columns:");
        int c = sc.nextInt();
        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];
        int i,j;
        System.out.println("Enter numbers in matrix 1:");
        for(i = 0;i<r;i++){
            for( j = 0;j<c;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter numbers in matrix 2:");
        for(i = 0;i<r;i++){
            for( j = 0;j<c;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int sum[][] = new int[r][c];
        for(i = 0;i<r;i++){
            for( j = 0;j<c;j++){
                sum[i][j] = matrix1[i][j] +matrix2[i][j];
            }
        }
        System.out.println("The sum of the matrix:");
        for(i = 0;i<r;i++){
            for( j = 0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
