package dataclasses;

import java.time.LocalDate;
import java.util.Date;

public class TestDate {

    public static void main (String[] args) {

        LocalDate getdate = LocalDate.now();
        System.out.println("***for LocalDAte *** - " + getdate);

        Date date = new Date();
        System.out.println("***for date *** - " + date);

    }
}
