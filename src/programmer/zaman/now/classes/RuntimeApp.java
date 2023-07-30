package programmer.zaman.now.classes;

// MATERI RUNTIME CLASS
public class RuntimeApp {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime(); // Cara buat object Runtime Class

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
        // ...Dan masih banyak lagi method nya

    }
}
