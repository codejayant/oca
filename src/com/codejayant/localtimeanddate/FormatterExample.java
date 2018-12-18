package com.codejayant.localtimeanddate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterExample {

    public static void main(String[] args) {

        try {
            String oldDate = "2018-12-15-10:00:00.000";
            String date = "2018-12-15";

            DateTimeFormatter publishDateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            DateTimeFormatter receivedDateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss.SSS");
            LocalDate localDateTime = LocalDate.parse(oldDate, receivedDateTimeFormat);
            String dateString = localDateTime.format(publishDateTimeFormat);
            System.out.println(dateString);

            //			DateTimeFormatter receivedDateTimeFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //			LocalDate localDateTime1 = LocalDate.parse(date, receivedDateTimeFormat1);
            //			String dateString1 = localDateTime1.format(publishDateTimeFormat);
            //			System.out.println(dateString1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
