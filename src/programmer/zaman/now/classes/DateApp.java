package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

// MATERI DATE DAN CALENDAR CLASS
public class DateApp {
    public static void main(String[] args) {

        // Date
        Date tanggal = new Date(); // Date tanpa parameter milisecond = date hari ini
//        Date tanggal = new Date(23587200000L); // Date dengan parameter milisecond

        System.out.println(tanggal);

        // Calendar
        Calendar calendar = Calendar.getInstance(); // Untuk membuat object calendar

//        calendar.add(Calendar.YEAR, -10); // untuk mengurangi tahun (add)
        calendar.set(Calendar.YEAR, 2010); // untuk men set tahun (set)
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 21);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date result = calendar.getTime(); // cara konversi ke date

        System.out.println(result);

    }
}
