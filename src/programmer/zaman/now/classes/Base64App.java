package programmer.zaman.now.classes;

import java.util.Base64;

// MATERI BASE64 CLASS
public class Base64App {
    public static void main(String[] args) {

        // Encoding
        String original = "Eko Kurniawan Khannedy";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes()); // Proses encoding
        /*
        * Notes!
        * > original.getBytes(), adalah mengkonversi String original menjadi array byte
        * */

        System.out.println(encoded);

        // Decoding
        byte[] bytes = Base64.getDecoder().decode(encoded); // tipe data hasil decoding adalah byte[] (Array byte)
        String result = new String(bytes); // Konversi byte array diatas menjadi String

        System.out.println(result);

    }
}
