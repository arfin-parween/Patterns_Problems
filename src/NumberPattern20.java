import java.util.Scanner;
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
public class NumberPattern20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number  Rows");
        int a =sc.nextInt();
        pattern20(a);
    }
    static void pattern20(int row){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
