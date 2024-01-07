import java.util.Scanner;
/*
Print Reverse Right Half Pyramid
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern5(a);
    }
    static void pattern5(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
