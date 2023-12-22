import java.math.BigInteger;
import java.util.Scanner;

public class operators2 {
    static int compare(BigInteger x, BigInteger y) {
        return x.compareTo(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in order: a1, a2, b1, b2");
        BigInteger a1 = sc.nextBigInteger();
        BigInteger a2 = sc.nextBigInteger();
        BigInteger b1 = sc.nextBigInteger();
        BigInteger b2 = sc.nextBigInteger();

        System.out.println("Values given are:");
        System.out.println("a1:" + a1 + " a2:" + a2 + " b1:" + b1 + " b2:" + b2);

        // For verification purpose
        BigInteger X = a1.multiply(a2);
        BigInteger Y = b1.multiply(b2);

        System.out.println("*********************************");
        System.out.println("Expected result: " + compare(X, Y));
        System.out.println("*********************************");

        // Applying bit level manipulation
        BigInteger x = a1.shiftLeft(a2.intValue());
        BigInteger y = b1.shiftLeft(b2.intValue());

        System.out.println("*********************************");
        System.out.println("Observed result: " + compare(x, y));
        System.out.println("*********************************");
    }
}


