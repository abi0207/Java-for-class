import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, c = 1;
        int[] p, a;
        p = new int[100002];
        a = new int[102];
        p[0] = p[1] = 1;
        for (i = 2; i < 320; ++i)
            if (p[i] == 0) {
                for (int j = i * i; j < 100000; j += i)
                    p[j] = 1;
            }
        for (i = 2; c <= 100; i++)
            if (p[i] == 0) {
                int m = 0;
                for (int tmp = i; tmp > 0; tmp /= 10)
                    m = m * 10 + tmp % 10;
                if (m == i)
                    a[c++] = i;
            }
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (i = 1; i < n; ++i) {
                System.out.print(a[i]);
                if (i % 10 == 0)
                    System.out.println();
                else
                    System.out.print(" ");
            }
            if (i == n)
                System.out.println(a[i]);
            else
                System.out.println();
        }
    }
}
