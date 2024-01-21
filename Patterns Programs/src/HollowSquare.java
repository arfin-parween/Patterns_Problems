import java.util.Scanner;
/*
Print Hollow Square
* * * * *
*       *
*       *
*       *
* * * * *
 */
public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a= sc.nextInt();
        System.out.println("Enter Number of Columns");
        int b= sc.nextInt();
        pattern16(a,b);
    }
    static void pattern16(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1 || j==1 || i==row || j==col)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
