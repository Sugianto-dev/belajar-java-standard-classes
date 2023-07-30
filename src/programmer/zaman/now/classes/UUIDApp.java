package programmer.zaman.now.classes;

import java.util.UUID;

// MATERI UUID CLASS
public class UUIDApp {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            UUID uuid = UUID.randomUUID(); // Cara buat object UUID
            String key = uuid.toString(); // Konversi UUID ke String

            System.out.println(key);

        }

    }
}
