package programmer.zaman.now.classes;

// MATERI STRINGBUFFER DAN STRINGBUILDER CLASS
public class StringBuilderApp {
    public static void main(String[] args) {

        // STRINGBUILDER

        String name = "Eko";

        name = name + " " + "Kurniawan";

        name = name + " " + "Khannedy";

        System.out.println(name);

        /*
        * Notes!
        * > Sebenarnya di java membuat 3 object
        *   > Eko
        *   > Eko Kurniawan
        *   > Eko Kurniawan Khannedy
        *
        * > Jadi disarankan jika ingin membuat manipulasi String tidak menggunakan String langsung karna memakan banyak memory
        * > Jadi lebih baik menggunakan StringBuilder
        * > Code lebih panjang tapi konsumsi memory lebih sedikit daripada String langsung
        * */

        StringBuilder builder = new StringBuilder();
        builder.append("Eko");
        builder.append(" ");
        builder.append("Kurniawan");
        builder.append(" ");
        builder.append("Khannedy");

        String name2 = builder.toString(); // Proses konversi StringBuilder ke String
        System.out.println(name2);

    }
}
