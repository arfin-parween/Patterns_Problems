import java.util.Scanner;
/*
5 4 3 2 1
 5 4 3 2
  5 4 3
   5 4
    5
 */
public class NumberPattern9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern9(a);
    }
    static void pattern9(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = row; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
