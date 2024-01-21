import java.util.Scanner;
/*
Print Left Half Pyramid
*****
 ****
  ***
   **
    *
 */
public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern6(a);
    }
    static void pattern6(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = row; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
