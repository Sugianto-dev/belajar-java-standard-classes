package programmer.zaman.now.classes;

import java.math.BigInteger;

// MATERI BIGNUMBER CLASS
public class BigNumberApp {
    public static void main(String[] args) {

        // BigInteger
        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        BigInteger c = a.add(b); // Untuk a + b
        BigInteger d = c.subtract(b); // untuk c - b
        BigInteger e = c.multiply(b); // untuk c * b
        BigInteger f = c.divide(b); // untuk c / b
        BigInteger g = c.mod(b); // untuk c % b
        // ...Dan masih banyak lainnya

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // BigDecimal
        // Cara buat nya sama dengan diatas
        // floating point (ada koma nya)

    }
}
