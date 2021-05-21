package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,4,19,23,59,30);
        Date date = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = new Date();
        String chaine1 = format.format(date1);

        String chaine2 = "19/05/2019 23:59:30";
        Date date2 = format.parse(chaine2);

        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM EEEEE HH mm ss", Locale.FRANCE);
        System.out.println(dateFormat.format(new Date()));

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy MM EEEEE HH mm ss", Locale.GERMANY);
        System.out.println(dateFormat1.format(new Date()));

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy MM EEEEE HH mm ss", Locale.CHINESE);
        System.out.println(dateFormat2.format(new Date()));

        SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy MM EEEEE HH mm ss", new Locale("ru"));
        System.out.println(dateFormat3.format(new Date()));

    }
}
//
//public class TestCalendar {
//
//    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2016);
//        calendar.set(Calendar.MONTH, Calendar.MAY);
//        calendar.set(Calendar.DAY_OF_MONTH, 19);
//        calendar.set(Calendar.HOUR_OF_DAY, 23);
//        calendar.set(Calendar.MINUTE, 59);
//        calendar.set(Calendar.SECOND, 30);
//        Date date = calendar.getTime();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat.format(date));
//
//        Calendar calendar2 = Calendar.getInstance();
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        System.out.println(simpleDateFormat2.format(calendar2.getTime()));
//
//        SimpleDateFormat simpleDateFormatFrench = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.FRENCH);
//        SimpleDateFormat simpleDateFormatRusse = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.forLanguageTag("ru"));
//        SimpleDateFormat simpleDateFormatChinois = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.CHINESE);
//        SimpleDateFormat simpleDateFormatAllemand = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.GERMAN);
//
//        System.out.println(simpleDateFormatFrench.format(calendar2.getTime()));
//        System.out.println(simpleDateFormatRusse.format(calendar2.getTime()));
//        System.out.println(simpleDateFormatChinois.format(calendar2.getTime()));
//        System.out.println(simpleDateFormatAllemand.format(calendar2.getTime()));
//
//    }
//
//
//}
