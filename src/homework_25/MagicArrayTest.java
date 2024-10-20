package homework_25;

import homework_16.MagicArrayHW;

public class MagicArrayTest {
    public static void main(String[] args) {
        MagicArray<Integer> magicArray = new MagicArray();
        magicArray.add(10);
        magicArray.add(20);
        magicArray.add(30);
        System.out.println(" now" + magicArray);

        magicArray.add(50, 60, 70, 80, 90, 100, 110, 120, 130, 80, 140, 150);

        System.out.println(magicArray.toString());

        System.out.println("Индекс числа 80 = " + magicArray.indexOf(80));
        System.out.println("Индекс числа 81 = " + magicArray.indexOf(81));
        // Task 2 HW 17
        System.out.println("Индекс последнего вхождения числа 80 = " + magicArray.indexOfLast(80));
        System.out.println("Индекс последнего вхождения числа 81 = " + magicArray.indexOfLast(81));

        System.out.println("По индексу 10 находится число: " + magicArray.getByInd(10));

        System.out.println("Текущее количество элементов в массиве: " + magicArray.size());

        System.out.println("Удалось удалить элемент по индексу 3 = " + magicArray.remove(3));
        System.out.println("Удалось удалить элемент по индексу 20 = " + magicArray.remove(20));

        MagicArrayHW arr = new MagicArrayHW(15, 25, 35, 55, 65, 75, 85, 95, 105, 115, 125, 135, 145, 155);

        System.out.println("Массив созданный внутри конструктора: " + arr.toString());

        System.out.println("Удалось удалить элемент со значением 115 = " + arr.remove(115));
        System.out.println("Удалось удалить элемент со значением 21 = " + arr.remove(21));
        System.out.println("Массив после удаления: " + arr.toString());

        System.out.println("----------------- Массив String--------");

        MagicArray<String> magicArray2 = new MagicArray();
        magicArray2.add("10");
        magicArray2.add("20");
        magicArray2.add("30");
        System.out.println(" now" + magicArray2);

        magicArray2.add("50", "60", "70", "80", "90", "100", "110", "120", "130", "80", "140", "150");

        System.out.println(magicArray2.toString());

        System.out.println("Индекс строки 80 = " + magicArray2.indexOf("80"));
        System.out.println("Индекс строки 81 = " + magicArray2.indexOf("81") + ". Это массив строк. Число не найдено");
        // Task 2 HW 17
        System.out.println("Индекс последнего вхождения строки 80 = " + magicArray2.indexOfLast("80"));
        System.out.println("Индекс последнего вхождения строки 81 = " + magicArray2.indexOfLast("81"));

        System.out.println("По индексу 10 находится строка: " + magicArray2.getByInd(10));

        System.out.println("Текущее количество элементов в массиве: " + magicArray2.size());

        System.out.println("Удалось удалить элемент по индексу 3 = " + magicArray2.remove(3));
        System.out.println("Удалось удалить элемент по индексу 20 = " + magicArray2.remove(20));


    }
}
