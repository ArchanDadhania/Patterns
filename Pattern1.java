import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int row = 1;

        while(row <= N)
        {
            int col = 1;
            while (col<=N)
            {
                System.out.print("*");
                col = col +1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
