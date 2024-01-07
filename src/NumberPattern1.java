import java.util.Scanner;
/*
11111
22222
33333
44444
55555
 */
public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a= sc.nextInt();
        System.out.println("Enter Number of Columns");
        int b= sc.nextInt();
        pattern1(a,b);
    }
    static void pattern1(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
