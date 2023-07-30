package programmer.zaman.now.classes;

// MATERI STRING CLASS
public class StringApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Jika ingin melihat ada method apa aja di String, tinggal tahan Ctrl + klik di String
        * > atau klik Structure -> (Ctrl tahan + klik String)
        * > ada banyak sekali method pada String
        * */

        String name = "Eko Kurniawan Khannedy";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();
        /*
        * Notes!
        * > String tidak bisa berubah
        * > Ketika name.toLowerCase(), tidak merubah / berpengaruh untuk String utamanya
        * > Ketika name.toLowerCase(), String asli tidak akan berubah tapi .toLowerCase() akan membuat String baru dari
        *   String name diatasnya
        * */

        System.out.println(name); // tetap aslinya
        System.out.println(nameLowercase); // lowercase
        System.out.println(nameUppercase); // uppercase
        System.out.println(name.length()); // menghitung panjang karakter string termasuk spasi (return int)
        System.out.println(name.startsWith("Eko")); // True
        System.out.println(name.endsWith("Khannedy")); // True

        String[] names = name.split(" "); // Memotong String
        System.out.println(names); // Menampilkan lokasi memory nya saja
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank()); // true
        System.out.println(" ".isEmpty()); // false, karena masih ada spasi
        System.out.println("".isEmpty()); // true
        System.out.println(name.charAt(0)); // E

        char[] chars = name.toCharArray();
        System.out.println(chars[3]); // Spasi

    }
}
