package programmer.zaman.now.classes;

import java.util.StringJoiner;

// MATERI STRINGJOINER CLASS
public class StringJoinerApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Tujuan : Jika ingin mem print array dengan format yang kita inginkan
        * */

        StringJoiner joiner = new StringJoiner(", ", "{", "}"); // Delimeter(Pemisah String), awal, akhir

        joiner.add("Eko");
        joiner.add("Kurniawan");
        joiner.add("Khannedy");

        String value = joiner.toString();
        System.out.println(value);

    }
}
