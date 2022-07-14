import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;
        int temp = 1;
        while (row<=n)
        {
            int col = 1;
            while (col<=row)
            {
                System.out.print(temp);
                col+=1;
                temp +=1;
            }
            System.out.println();
            row+=1;
        }
    }
}
