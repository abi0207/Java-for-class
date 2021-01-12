import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println("It is not an odd number.");
            else {
                System.out.println((n * n / 2 + 1) * n);
                int i = n * n, j, y = n / 2 + 1, x = 1;
                int[][] a = new int[105][105];
                for (; i > 0; --i) {
                    if (a[(x + n - 1) % n][(y + n - 1) % n] == 0) {
                        x = (x + n - 1) % n;
                        y = (y + n - 1) % n;
                        a[x][y] = i;
                    } else {
                        x = (x + 1) % n;
                        a[x][y] = i;
                    }
                }
                for (i = 0; i < n; ++i) {
                    for (j = 0; j < n; ++j)
                        System.out.printf("%5d", a[i][j]);
                    System.out.println();
                }
            }
            if (sc.hasNextInt())
                System.out.println();
            else
                break;
        }
    }
}