package homework_25;


public class MagicArray<T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        array = (T[]) (new Object[10]);
    }

    // Добавление в массив одного элемента
    void add(T value) {

        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    void add(T... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return null; // Хорошего решения нет.
        //Todo Поправить обработку не корректного индекса
    }

    public T remove(int index) {
              /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return null;
        }

    }

    public int indexOf(T value) {
        int res = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                res = i;
                return res;
            }
        }
        return -1;
    }

    public int indexOfLast(T value) {        //Task 2 HW 17
        int res = -1;
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                res = i;
                return res;
            }
        }
        return -1;
    }

    public boolean remove(T value) {
        int ind = indexOf(value);
        if (ind == -1) {
            return false;
        }
        remove(ind);
        return true;

    }

    public T getByInd(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }


}

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива)
2. Динамическое изменение размера массива
3. Возвращать строковое представление массива (какие элементы тым есть)
4. Добавляем в массив сразу несколько значений.
5. Текущее количество элементов в массиве
6. Возвращает значение по индексу
7. Удаляет элемент по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)

 */

