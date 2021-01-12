import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m, n, g, l;
        while (sc.hasNextBigInteger()) {
            m = sc.nextBigInteger();
            n = sc.nextBigInteger();
            g = m.gcd(n);
            l = (m.multiply(n)).divide(g);
            System.out.println(g + " " + l);
            m = l.nextProbablePrime();
            for (int i = 0; i < 4; ++i) {
                System.out.print(m + " ");
                m = m.nextProbablePrime();
            }
            System.out.println(m);
        }
    }
}
