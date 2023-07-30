package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// MATERI PROPERTIES CLASS
public class PropertiesApp {
    public static void main(String[] args) {

        // MENGAKSES FILE
//        Properties properties = new Properties(); // Membuat object dari Properties Class
//        properties.load(new FileInputStream("application.properties")); // proses load file nya
        /*
        * Notes!
        * > FileInputStream -> Termasuk Java IO
        * > Akan ada error exception jadi harus menggunakan try-catch
        * */

        try {
            Properties properties = new Properties(); // Membuat object dari Properties Class
            properties.load(new FileInputStream("application.properties")); // proses load file nya

            // Proses mengambil data dari file
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        // MENYIMPAN KEDALAM FILE
        /*
        * Notes!
        * > File yang akan dibuat tidak harus ada terlebih dahulu
        * > File akan dibuat otomatis saat program di run
        * */
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Eko");
            properties.put("name.middle", "Kurniawan");
            properties.put("name.last", "Khannedy");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama"); // proses save file nya
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan propeties");
        }

    }
}
