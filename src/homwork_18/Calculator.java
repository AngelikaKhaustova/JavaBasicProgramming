package homwork_18;

public class Calculator {
    private static final float PI = 3.141592F; // HW 19 Task 1
    private static final int MAX_USERS = 100; // HW 19 Task 2

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }
         // HW 19 Task 1
    public static double circleLength(double radius) {
        return 2 * PI * radius;

    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
      // HW 19 Task 2
//    public static double newMaxUsers(int newMaxUsers){
//        MAX_USERS = newMaxUsers;
//        return newMaxUsers;// cannot assign a value to static final variable MAX_USERS
//    }


}
