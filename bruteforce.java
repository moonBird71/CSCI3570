import java.util.Scanner;
public class bruteforce
{
    public static void main(String args[])
    {
        boolean check = false;
        int d = 0;
        int x = 0;
        int y = 0;
        int n = 1722629;
        int e = 41996;

        while(check == false)
        {
            x = (d * 1305808) % n;
            y = (e * x) % n;
            if(y == 1305808)
            {
                check = true;
                System.out.printf("(%d * %d) MOD %d = %d\n", d, y, n, x);
            }
            d++;
        }
    }
}
