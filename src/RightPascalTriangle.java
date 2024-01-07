import java.util.Scanner;
/*
Print Right Pascal Triangle
    *
   **
  ***
 ****
  ***
   **
    *
 */
public class RightPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a = sc.nextInt();
        pattern12(a);
    }

    static void pattern12(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}