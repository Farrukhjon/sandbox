package io.github.farrukhjon.experiment.java.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalDateTest {

    @Test
    void testFormatLocalDateToStringDateByBASIC_ISO_DATE() {
        DateTimeFormatter yyyyMMddFormat = DateTimeFormatter.BASIC_ISO_DATE; // BASIC_ISO_DATE=yyyyMMdd=20200916
        LocalDate localDate = LocalDate.now();
        String stringDate = localDate.format(yyyyMMddFormat);
        System.out.println(stringDate);
    }

    @Test
    void testParseStringDateToLocalDate() {
        DateTimeFormatter yyyyMMddFormat = DateTimeFormatter.BASIC_ISO_DATE; // BASIC_ISO_DATE=yyyyMMdd=20200916
        String stringDate = "20200916";
        LocalDate localDate = LocalDate.parse(stringDate, yyyyMMddFormat);
        assertEquals("2020-09-16", localDate.toString());
    }

    @Test
    void testFormatLocalDateToIntegerDate() {
        DateTimeFormatter yyyyMMddFormat = DateTimeFormatter.BASIC_ISO_DATE; // BASIC_ISO_DATE=yyyyMMdd=20200916
        LocalDate localDate = LocalDate.now();
        String stringDate = localDate.format(yyyyMMddFormat);
        Integer integerDate = Integer.valueOf(stringDate);
        System.out.println(integerDate);
    }

    @Test
    void testParseIntegerDateToLocalDate() {
        DateTimeFormatter yyyyMMddFormat = DateTimeFormatter.BASIC_ISO_DATE; // BASIC_ISO_DATE=yyyyMMdd=20200916
        Integer integerDate = 20200916;
        LocalDate localDate = LocalDate.parse(String.valueOf(integerDate), yyyyMMddFormat);
        assertEquals("2020-09-16", localDate.toString());
    }
}
