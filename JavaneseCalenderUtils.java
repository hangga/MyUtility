package id.web.hangga.pasaran.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hangga on 08/11/16.
 * Modul ini hanyalah modifikasi dari program milik Yulianta Ramelan
 * bisa Anda hubungi di http://www.yulianta.web.id atau email: y_anta@yahoo.com (jika masih aktif)
 * Terimakasih
 */

public class JavaneseCalenderUtils {
    public static String getDina(int day, int month, int year) {
        int tempyear, valdlookup, valdlookupday;
        String dinane = new String("");

        //element 0 of dina is null
        String dina[] = {"", "Ahad", "Senen", "Selasa", "Rebo", "Kemis", "Jemuah", "Setu"};
        int dinalookup[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 5, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0},
                {3, 6, 6, 2, 4, 0, 2, 5, 1, 3, 6, 1},
                {4, 0, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3},
                {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4},
                {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
                {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6},
                {2, 5, 6, 2, 4, 0, 2, 5, 1, 3, 6, 1},
                {4, 0, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2},
                {5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3},
                {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4},
                {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6},
                {2, 5, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0},
                {3, 6, 6, 2, 4, 0, 2, 5, 1, 3, 6, 1},
                {4, 0, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2},
                {5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4},
                {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
                {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6},
                {2, 5, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0},
                {3, 6, 0, 3, 5, 1, 3, 5, 2, 4, 0, 2},
                {5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3},
                {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4},
                {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
                {1, 4, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0},
                {3, 6, 6, 2, 4, 0, 2, 5, 1, 3, 6, 1},
                {4, 0, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2},
                {5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3},
                {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
                {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6}
        };

        tempyear = year+15;
        if (tempyear % 28 == 0) {
            //no remainder, set to the last element
            valdlookup = dinalookup[28][month-1];}
        else {
            valdlookup = dinalookup[tempyear % 28][month-1];}
        valdlookupday = valdlookup + day;
        if (valdlookupday > 7) {
            if (valdlookupday % 7 == 0) {
                //no remainder, set to the last element
                dinane = dina[7];}
            else {
                dinane = dina[(valdlookupday % 7)];}
        }
        else {
            dinane = dina[valdlookupday];}
        return dinane;
    }

    //function to get "pasaran" (day mark) in javanesse language
    public static String getPasaran (int day, int month, int year) {
        int tempyear, valplookup, valplookupday;
        String pasarane = new String("");

        //element 0 of pasaran is always null
        String pasaran[] = {"", "Legi", "Pahing", "Pon", "Wage", "Kliwon"}; // asli
        int pasaranlookup[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 2, 1, 2, 2, 3, 3, 4, 0, 0, 1, 1},
                {2, 3, 1, 2, 2, 3, 3, 4, 0, 0, 1, 1},
                {2, 3, 1, 2, 2, 3, 3, 4, 0, 0, 1, 1},
                {2, 3, 1, 2, 2, 3, 3, 4, 0, 0, 1, 1},
                {2, 3, 2, 3, 3, 4, 4, 0, 1, 1, 2, 2},
                {3, 4, 2, 3, 3, 4, 4, 0, 1, 1, 2, 2},
                {3, 4, 2, 3, 3, 4, 4, 0, 1, 1, 2, 2},
                {3, 4, 2, 3, 3, 4, 4, 0, 1, 1, 2, 2},
                {3, 4, 3, 4, 4, 0, 0, 1, 2, 2, 3, 3},
                {4, 0, 3, 4, 4, 0, 0, 1, 2, 2, 3, 3},
                {4, 0, 3, 4, 4, 0, 0, 1, 2, 2, 3, 3},
                {4, 0, 3, 4, 4, 0, 0, 1, 2, 2, 3, 3},
                {4, 0, 4, 0, 0, 1, 1, 2, 3, 3, 4, 4},
                {0, 1, 4, 0, 0, 1, 1, 2, 3, 3, 4, 4},
                {0, 1, 4, 0, 0, 1, 1, 2, 3, 3, 4, 4},
                {0, 1, 4, 0, 0, 1, 1, 2, 3, 3, 4, 4},
                {0, 1, 0, 1, 1, 2, 2, 3, 4, 4, 0, 0},
                {1, 2, 0, 1, 1, 2, 2, 3, 4, 4, 0, 0},
                {1, 2, 0, 1, 1, 2, 2, 3, 4, 4, 0, 0},
                {1, 2, 0, 1, 1, 2, 2, 3, 4, 4, 0, 0}
        };

        tempyear = year+17;
        if (tempyear % 20 == 0) {
            //no remainder, set to the last element
            valplookup = pasaranlookup[20][month-1];}
        else {
            valplookup = pasaranlookup[tempyear % 20][month-1];}

        valplookupday = valplookup + day;
        if (valplookupday > 5) {
            if (valplookupday % 5 == 0) {
                //no remainder, set to the last element
                pasarane = pasaran[5];}
            else {
                pasarane = pasaran[(valplookupday % 5)];}
        }
        else {
            pasarane = pasaran[valplookupday];}

        return pasarane;
    }

    //function to get "neptu" (day mark value) in javanesse language
    public static int getNeptuDino(String dinane) {
        if (dinane.equals("Minggu")) return 5;
        if (dinane.equals("Senin")) return 4;
        if (dinane.equals("Selasa")) return 3;
        if (dinane.equals("Rabu")) return 7;
        if (dinane.equals("Kamis")) return 8;
        if (dinane.equals("Jum'at")) return 6;
        if (dinane.equals("Sabtu")) return 9;
        return 0;
    }

    public static int getNeptuPasar(String pasarane) {
        if (pasarane.equals("Legi")) return 5;
        if (pasarane.equals("Pahing")) return 9;
        if (pasarane.equals("Pon")) return 7;
        if (pasarane.equals("Wage")) return 4;
        if (pasarane.equals("Kliwon")) return 8;
        return 0;
    }


    // Output format : Selasa Pahing, 08-Nopember-2016
    public static String getJavaneseDate(Calendar tgl){
        String dina, pasaran, hasil, date;

        int thedate = tgl.get(Calendar.DATE);
        int themonth = tgl.get(Calendar.MONTH) + 1;
        int theyear = tgl.get(Calendar.YEAR);

        dina = getDina(thedate, themonth, theyear);
        pasaran = getPasaran(thedate, themonth, theyear);
        date = new SimpleDateFormat("dd-MMMM-yyyy").format(tgl.getTime());
        //new SimpleDateFormat("dd-MMMM-yyyy").format(tgl);

        hasil = dina + " " + pasaran + ", "+ date;

        return hasil;
    }

    // Output format : Pahing
    public static String getPasaran(Calendar tgl){
        int thedate = tgl.get(Calendar.DATE);
        int themonth = tgl.get(Calendar.MONTH) + 1;
        int theyear = tgl.get(Calendar.YEAR);
        return  getPasaran(thedate, themonth, theyear);
    }

    // Output format : Ahad
    public static String getDina(Calendar tgl){
        int thedate = tgl.get(Calendar.DATE);
        int themonth = tgl.get(Calendar.MONTH) + 1;
        int theyear = tgl.get(Calendar.YEAR);
        return getDina(thedate, themonth, theyear);
    }

    //main function
    public static String hitung(Calendar tgl) {
        String dina, pasaran, hasil;
        int neptu, neptudino, neptupasar;

        //get the users input
        int thedate = tgl.get(Calendar.DATE);
        int themonth = tgl.get(Calendar.MONTH) + 1;
        int theyear = tgl.get(Calendar.YEAR);

        dina = getDina(thedate, themonth, theyear);
        pasaran = getPasaran(thedate, themonth, theyear);
        neptudino = getNeptuDino(dina);
        neptupasar = getNeptuPasar(pasaran);
        neptu = neptudino + neptupasar;

        hasil = new String("\nHari   : " + dina + " (" +
                new Integer(neptudino).toString() + ")\n" +
                "Pasaran: " + pasaran + " (" +
                new Integer(neptupasar).toString() + ")\n" +
                "Neptu   : " + new Integer(neptu).toString());
        return hasil;
    }
}
