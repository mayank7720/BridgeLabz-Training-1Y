package com.gla.interfacesabstraction.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtility {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
