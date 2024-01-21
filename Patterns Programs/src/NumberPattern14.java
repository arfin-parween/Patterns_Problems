import java.util.Scanner;
/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class NumberPattern14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern14(a);
    }
    static void pattern14(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=row ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = row-1; i >=1 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=row ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
