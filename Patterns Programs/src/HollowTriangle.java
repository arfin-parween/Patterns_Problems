import java.util.Scanner;
/*
Print Hollow Triangle
          *
        *   *
      *       *
    *           *
  *               *
* * * * * * * * * * *
 */
public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern18(a);
    }
    static void pattern18(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                if(i==1 || j==1 || i==row || j==(2*i)-1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
