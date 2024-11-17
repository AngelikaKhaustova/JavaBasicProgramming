package homework_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

//Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке
public class Task2 {
    public static void main(String[] args) {
        List<LocalDate> dateList = new ArrayList<>();
        dateList.add(LocalDate.of(2000, 01, 01));
        dateList.add(LocalDate.of(2011, 02, 17));
        dateList.add(LocalDate.of(2015, 05, 28));
        dateList.add(LocalDate.of(2010, 12, 20));
        dateList.add(LocalDate.of(2020, 10, 10));
        dateList.add(LocalDate.of(2018, 03, 02));

        System.out.println("Дан список дат: " + dateList.toString());
        long daysDiff = countDaysDiff(dateList);
        System.out.println("Кол-во дней между самой ранней и самой поздней датами = " + daysDiff);

    }

    private static long countDaysDiff(List<LocalDate> dateList) {
        dateList.sort((d1, d2) -> d1.compareTo(d2));
        LocalDate minDate = dateList.get(0);
        LocalDate maxDate = dateList.get(dateList.size()-1);
        return ChronoUnit.DAYS.between(minDate, maxDate);
    }
}
