package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class TestDates {
    public static void main(String[] args) {


        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatter.format(date));


        Calendar calendar = Calendar.getInstance();
        calendar.getTime();



        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("2016 05 12 HH mm ss");

        Date date1 = new Date();
        String chaine1 = format.format(date1);

        System.out.println(chaine1);


    }
}


//
//public class TestDates {
//
//    public static void main(String[] args) {
//
//        Date date1 = new Date();
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat1.format(date1));
//
//        Date date2 = new Date(2016 - 1900, Calendar.MAY, 19, 23, 59, 30);
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        System.out.println(simpleDateFormat2.format(date2));
//        System.out.println(simpleDateFormat2.format(date1));
//    }
//
//}
