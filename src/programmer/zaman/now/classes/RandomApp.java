package programmer.zaman.now.classes;

import java.util.Random;

// MATERI RANDOM CLASS
public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random(); // Membuat object Random Class

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000); // artinya generate random int tidak boleh lebih dari 1000
            System.out.println(value);
        }

    }
}
