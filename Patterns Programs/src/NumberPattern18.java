import java.util.Scanner;
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class NumberPattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern18(a);
    }
    static void pattern18(int row){
        for (int i = 1; i <=row ; i++) {
            int num=i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num = num+row-j;
            }
            System.out.println();
        }
    }
}
