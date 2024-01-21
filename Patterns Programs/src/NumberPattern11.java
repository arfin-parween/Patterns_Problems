import java.util.Scanner;
/*
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
 */
public class NumberPattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern11(a);
    }
    static void pattern11(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
