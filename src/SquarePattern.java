import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a= sc.nextInt();
        System.out.println("Enter Number of Columns");
        int b= sc.nextInt();
        pattern(a,b);
    }
    static void pattern(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
