import java.util.Scanner;
/*
Print full Pyramid
          *
        * * *
      * * * * *
     * * * * * * *
   * * * * * * * * *
 * * * * * * * * * * *
 */
public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern17(a);
    }
    static void pattern17(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
