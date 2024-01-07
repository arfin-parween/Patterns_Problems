import java.util.Scanner;
/*
Print Right Half Pyramid
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern2(a);
    }
    static void pattern2(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
