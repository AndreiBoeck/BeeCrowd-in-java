import java.util.Scanner;
/** To calculate the difference between two numbers time two numbers */

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int p2 = in.nextInt();
        int p3 = in.nextInt();
        int p4 = in.nextInt();
        int m = (p1 * p2 - p3 * p4);
        System.out.printf("DIFERENCA = ");
        System.out.println(m);
    }
}
