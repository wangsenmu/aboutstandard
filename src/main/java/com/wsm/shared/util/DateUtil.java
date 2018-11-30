package com.wsm.shared.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wangsenmu
 * @date 2018/11/29 15:08
 */
public class DateUtil {

    public static final String DATE_FORMAT_DAY = "yyyy-MM-dd";


    public static LocalDate format() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT_DAY);
        LocalDateTime localDateTime = LocalDateTime.parse("2018-05-05", dateTimeFormatter);


        return localDateTime.toLocalDate();
    }


    public static void main(String[] args) {

        System.out.println("-------"+format());

    }

}