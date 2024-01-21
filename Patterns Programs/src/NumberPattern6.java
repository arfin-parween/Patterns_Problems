import java.util.Scanner;
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */
public class NumberPattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern6(a);
    }
    static void pattern6(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
