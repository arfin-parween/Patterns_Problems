import java.util.Scanner;
/*
   1
  1 1
 1 2 1
1 3 3 1

 */
public class NumberPattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern15(a);
    }
    static void pattern15(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >i ; j--) {
                System.out.print("&");
            }
            int x=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(x+" ");
                x = x * (i - j) / j;
            }
            System.out.println();
        }
    }
}
