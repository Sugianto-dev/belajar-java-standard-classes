package programmer.zaman.now.classes;

// MATERI NUMBER CLASS
public class NumberApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Ini untuk Bukan Primitive
        * > Konversi tipe data number 1 ke tipe data number lainnya
        * */
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi String ke number

//        String contoh = "10000A"; // Tidak bisa di konversi ke tipe data number dikarenakan mengandung String A
//        String contoh = "10000"; // Untuk konversi ke Integer
        String contoh = "100.10";

//        int contohInt = Integer.parseInt(contoh); // parseInt untuk tipe data primitive (int)
//        Integer contohInt = Integer.valueOf(contoh); // valueOf untuk tipe data non primitive (Integer)
        Double contohDouble = Double.valueOf(contoh); // konversi String ke Double

//        System.out.println(contohInt);
        System.out.println(contohDouble);

    }
}
