package whileGita;

import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.print("N:");
        n = scanner.nextInt();
        System.out.print("M:");
        m = scanner.nextInt();

        while (n > m)
        {
            System.out.print(n % m);
            n /= m;
        }

    }

}

