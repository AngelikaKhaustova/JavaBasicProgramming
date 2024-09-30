package homework_14;

public class Homework_14 {
    public static void main(String[] args) {
        int[] massiv = new int[]{1, 2, 3, 4, 8, 10, 12, 13, 15, 20};
        int summa;
        summa = sumOdd(massiv);
        System.out.println("Сумма четных чисел = " + summa);

    }

    public static int sumOdd(int[] massiv) {
        int res = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                res = res + massiv[i];
            }
        }
        return res;
    }
}
