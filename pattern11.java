import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        while (row<=n)
        {
            int col =1;
            while (col<=n- row +1 )
            {
                System.out.print("*");
                col +=1;
            }
            System.out.println();
            row +=1;
        }
    }
}
