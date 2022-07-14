import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        while (row <= n)
        {
            int col = 1;
            while(col<=n)
            {
                System.out.print(col + row -1);
                col +=1;
            }
            System.out.println("");
            row = row +1;

        }
    }
}
