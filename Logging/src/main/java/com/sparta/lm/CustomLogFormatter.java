package com.sparta.lm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)
                + " " + record.getSourceClassName()
                + " " + record.getLevel()
                + " " + record.getMessage()
                + "\n";
    }
}