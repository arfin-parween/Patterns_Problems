import java.util.Scanner;
/*
1
22
333
4444
55555
 */
public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern3(a);
    }
    static void pattern3(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
