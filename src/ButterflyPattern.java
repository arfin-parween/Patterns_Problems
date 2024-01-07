import java.util.Scanner;
/*
Print Butterfly Pattern
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern15(a);
    }
    static void pattern15(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = row; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = row; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
