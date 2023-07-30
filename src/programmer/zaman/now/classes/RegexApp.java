package programmer.zaman.now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// MATERI REGULAR EXPRESSION
public class RegexApp {
    public static void main(String[] args) {

        String name = "Eko Kurniawan Khannedy Programmer Zaman Now";

        /*
        * Notes!
        * > [a-zA-Z]*[a][a-zA-Z]* artinya
        *   > [a-zA-Z]* => asalkan ada a kecil sampai z kecil, dan A besar sampai Z besar, * => jumlah karakter bebas
        *                  di awal karakter
        *   > [a]       => terdapat a di tengah karakter
        *   > [a-zA-Z]* => asalkan ada a kecil sampai z kecil, dan A besar sampai Z besar, * => jumlah karakter bebas
        *                  di akhir karakter
        * */
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*"); // Membuat object Pattern
        Matcher matcher = pattern.matcher(name); // Membuat object Matcher

        while (matcher.find()) { // matcher.find() => outputnya boolean
            String result = matcher.group();
            System.out.println(result);
        }

        // ...Dan masih banyak method lainnya

    }
}
