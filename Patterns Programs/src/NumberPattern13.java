import java.util.Scanner;
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
public class NumberPattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern13(a);
    }
    static void pattern13(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
