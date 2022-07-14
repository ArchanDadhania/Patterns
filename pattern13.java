import java.util.Scanner;

public class pattern13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        while (row<n)
        {
            int space = 1;
            while (space <= n - row)
            {
                System.out.print(" ");
                space += 1;
            }
            int num = 1;
            while (num <= row)
            {
                System.out.print(num);
                num = num + 1;
            }
            num = row - 1;
            while (num >= 1)
            {
                System.out.print(num);
                num -= 1;
            }
            row += 1;
            System.out.println();
        }
    }
}




