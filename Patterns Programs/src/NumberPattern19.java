import java.util.Scanner;
/*
10101
01010
10101
01010
10101
 */
public class NumberPattern19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number  Rows");
        int a =sc.nextInt();
        System.out.println("Enter Number of columns");
        int b =sc.nextInt();
        pattern19(a,b);
    }
    static void pattern19(int row, int col){
        for (int i = 1; i <=row ; i++) {
            int n;
            if (i % 2 == 0) {
                n = 0;
                for (int j = 1; j <= col; j++) {
                    System.out.print(n);
                    n = (n == 0) ? 1 : 0;
                }
            }
            else{
                n = 1;
                for (int j = 1; j <= col; j++) {
                    System.out.print(n);
                    n = (n == 0) ? 1 : 0;
                }
            }
            System.out.println();
            }
        }
    }

