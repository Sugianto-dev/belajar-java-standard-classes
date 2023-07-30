package programmer.zaman.now.classes;

import java.util.Objects;

// MATERI OBJECTS CLASS
public class ObjectsApp {

    public static class Data {
        private String data;

        // Generate constructor auto
        public Data(String data) {
            this.data = data;
        }

        // Generate getter & setter auto
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        // Generate equals() & hashcode() auto
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        // Generate toString() auto
        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//        execute(null); // Error NullPointerException jika dengan Cara 1 dibawah

        execute(null); // Setelah pakai Objects Class jadi bisa null
        execute(new Data("Eko"));
    }

    public static void execute(Data data) {
        // Cara tidak aman
//        System.out.println(data.toString()); // gak aman jika parameter null
//        System.out.println(data.hashCode()); // gak aman jika parameter null

        // Cara dengan pengecekan if
//        if (data != null) {
//            System.out.println(data.toString());
//            System.out.println(data.hashCode());
//        }

        // Cara dengan Objects Class
        System.out.println(Objects.toString(data)); // aman
        System.out.println(Objects.hashCode(data)); // aman

        // ...Dan masih banyak method lain di Objects Class
    }
}
