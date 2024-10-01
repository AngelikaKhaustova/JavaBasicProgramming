package homework_16;

public class MagicArrayHW {
    int[] array;
    int cursor;

    public MagicArrayHW() {
        array = new int[10];
    }

    public MagicArrayHW(int... numbers) {
        array = new int[10];
        add(numbers);
    }


    void add(int value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
        // System.out.println(" some ints" + numbers.length);
        // System.out.println("have index" + numbers[0]);
    }


    void expandArray() {
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

    int size() {
        return cursor;
    }

    int getByInd(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }

    int getByVal(int value) {
        int res = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                res = i;
            }
        }

        return res;
    }

    boolean remove(int index) {
        if (index >= 0 && index < cursor) {
            array[index] = 0;
            return true;
        }
        return false;
    }

    boolean remove2(int value) {
        int ind = getByVal(value);
        if(ind==-1){
            return false;
        }
        array[ind] = 0;
        return true;

    }
}
