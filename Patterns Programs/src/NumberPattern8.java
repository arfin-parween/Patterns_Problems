import java.util.Scanner;
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class NumberPattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern8(a);
    }
    static void pattern8(int row){
        int n=1;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
