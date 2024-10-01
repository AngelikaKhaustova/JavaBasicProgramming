package homework_16;



public class TestArrayHW {
    public static void main(String[] args) {
        MagicArrayHW magicArrayHW = new MagicArrayHW();
        magicArrayHW.add(10);
        magicArrayHW.add(20);
        magicArrayHW.add(30);
        System.out.println(" now" + magicArrayHW);

        magicArrayHW.add(50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150);

        System.out.println(magicArrayHW.toString());

        System.out.println("Индекс числа 80 = " + magicArrayHW.getByVal(80));
        System.out.println("Индекс числа 81 = " + magicArrayHW.getByVal(81));

        System.out.println("По индексу 10 находится число: " + magicArrayHW.getByInd(10));

        System.out.println("Текущее количество элементов в массиве: " + magicArrayHW.size());

        System.out.println("Удалось удалить элемент по индексу 3 = " + magicArrayHW.remove(3));
        System.out.println("Удалось удалить элемент по индексу 20 = " + magicArrayHW.remove(20));

        MagicArrayHW arr = new MagicArrayHW(15, 25, 35, 55, 65, 75, 85, 95, 105, 115, 125, 135, 145, 155);

        System.out.println("Массив созданный внутри конструктора: " + arr.toString());

        System.out.println("Удалось удалить элемент со значением 115 = " + arr.remove2(115));
        System.out.println("Удалось удалить элемент со значением 20 = " + arr.remove2(20));
        System.out.println("Массив после удаления: " + arr.toString());



    }
}
