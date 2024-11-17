package homework_46;
//Получить и вывести на экран:
//текущую дату
//текущий год, месяц и день
//Создать дату, например Ваш день рождения и вывести на экран
//Создать две даты и проверить на равенство
//Получить и вывести на экран:
//текущее время
//текущее время + 3 часа
//Создать дату:
//которая на неделю позже сегодняшней
//которая была на год раньше сегодняшней используя метод minus
//которая на год позже сегодняшней
//tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

import java.time.LocalDate;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата " + date);
        System.out.println("Текущий год: " + date.getYear() + " текущий месяц: " + date.getMonth() + " текущий день: " +
                date.getDayOfMonth());

        LocalDate dob = LocalDate.of(1979, 10, 10);
        System.out.println("день рождения: " + dob);

        boolean isAfter = date.isAfter(dob);
        System.out.println("date.isAfter(dob): " + isAfter);
        System.out.println("date.isBefore(dob): " + date.isBefore(dob));
        System.out.println("date.equals(dob): " + date.equals(dob));

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime.now(): " + time);
        System.out.println("time.plusHours(3): " + time.plusHours(3));

        LocalDate date2 = LocalDate.now().plusWeeks(1);
        System.out.println("плюс неделя " + date2);

        LocalDate date3 = LocalDate.now().minusYears(1);
        System.out.println("минус год " + date3);

        LocalDate date4 = LocalDate.now().plusYears(1);
        System.out.println("плюс год " + date4);

        LocalDate tomorrow=LocalDate.now().plusDays(1);
        LocalDate yesterday=LocalDate.now().minusDays(1);


        System.out.println("tomorrow.isBefore(today): " + tomorrow.isBefore(date));
        System.out.println("yesterday.isBefore(today): " + yesterday.isBefore(date));

    }
}
