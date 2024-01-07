import java.util.Scanner;
/*
Print Double hill Pattern
    *       *
   * *     * *
  * * *   * * *
 * * * * * * * *
* * * * * * * * *
 */
public class DoubleHill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern14(a);
    }
    static void pattern14(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = row-1; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                if(j==row)
                System.out.print("");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
