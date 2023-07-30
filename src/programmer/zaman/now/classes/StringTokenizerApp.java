package programmer.zaman.now.classes;

import java.util.StringTokenizer;

// MATERI STRINGTOKENIZER CLASS
public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Eko Kurniawan Khannedy";

        StringTokenizer tokenizer = new StringTokenizer(value, " "); // String, Delimeter(Pemisah String)

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

    }
}
