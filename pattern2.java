import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        while (row<=n)
        {
            int col = 1;
            while(col<=n)
            {
                System.out.print(row);
                col = col +1;

            }
            System.out.println();
            row = row +1;

        }

    }
}
