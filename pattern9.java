import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        while (row<=n)
        {
            int col = 1;
            while (col<=n)
            {
                System.out.print((char) (64+col+row-1));
                col +=1;
            }
            System.out.println();
            row +=1;
        }
    }
}
