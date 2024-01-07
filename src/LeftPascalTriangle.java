import java.util.Scanner;
/*
Print Left Pascal Triangle
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
public class LeftPascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern11(a);
    }
    static void pattern11(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=row ; i++) {
            for (int j = row; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
