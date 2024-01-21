import java.util.Scanner;
/*
123456
234561
345612
456123
561234
612345
 */
public class NumberPattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of levels or Rows");
        int a =sc.nextInt();
        pattern17(a);
    }
    static void pattern17(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = i; j <=row ; j++) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++)
                System.out.print(j-1);
            System.out.println();
        }

    }
}
