package programmer.zaman.now.classes;

// MATERI SYSTEM CLASS
public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());
        /*
        * Notes!
        * > Cara buat environment langsung disini
        *   > Klik SystemApp di pojok kanan atas
        *   > Edit Configurations...
        *   > Pilih SystemApp
        *   > Environment Variables -> Edit -> Tambah environment
        *   > Ok -> Ok
        * */
        System.out.println(System.getenv("APP"));

        System.gc();

        System.exit(1); // untuk menghentikan program

        System.out.println("Hi"); // tidak akan dijalankan karena keburu exit

        // ...Dan Masih banyak lagi

    }
}
