import java.util.Scanner;
/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */
public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern5(a);
    }
    static void pattern5(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
