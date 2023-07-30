package programmer.zaman.now.classes;

import java.util.Scanner;

// MATERI SCANNER CLASS
public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine(); // untuk tipe data string

//        scanner.nextInt(); // untuk tipe data int

//        scanner.nextBoolean(); // untuk tipe data boolean

//        scanner.nextLong(); // untuk tipe data long

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

//        System.out.println("Hello " + name);
        System.out.println("Hello " + name + " umur anda adalah " + age);

    }
}
