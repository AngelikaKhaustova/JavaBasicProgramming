package homework_16;

public class MagicArrayHW {
    private int[] array;
    private int cursor;

    public MagicArrayHW() {
        array = new int[10];
    }

    public MagicArrayHW(int... numbers) {
        array = new int[10];
        add(numbers);
    }


    public void add(int value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
        // System.out.println(" some ints" + numbers.length);
        // System.out.println("have index" + numbers[0]);
    }


    private void expandArray() {
        System.out.println("Расширяем массив, курсор= " + cursor);
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
        System.out.println("расшир массива завершено");

    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? "," : "]");

        }
        return result;

    }

    public int size() {
        return cursor;
    }

    public int getByInd(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }

    public int indexOf(int value) {
        int res = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                res = i;
                return res;
            }
        }
        return -1;
    }

    public int indexOfLast(int value) {        //Task 2 HW 17
        int res = -1;
        for (int i = cursor; i >= 0; i--) {
            if (array[i] == value) {
                res = i;
                return res;
            }
        }
        return -1;
    }

    public int remove(int index) {
        if (index >= 0 && index < cursor) {
            int value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return Integer.MIN_VALUE;
        }

    }

    public boolean remove2(int value) {
        int ind = indexOf(value);
        if (ind == -1) {
            return false;
        }
        remove(ind);
        return true;

    }
}
