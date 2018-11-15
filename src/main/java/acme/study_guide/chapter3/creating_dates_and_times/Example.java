package acme.study_guide.chapter3.creating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}