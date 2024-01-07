import java.util.Scanner;
/*
12345
1234
123
12
1
 */
public class NumberPattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern7(a);
    }
    static void pattern7(int row){
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
