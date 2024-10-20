package lesson_27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (isEmailValid(email)) {
            this.email = email;
        }
    }


    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */


    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            System.out.println("Неверный адрес электронной почты, отсутствует знак @");
            return false;
        }

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) {
            System.out.println("Неверный адрес электронной почты, отсутствует . ");
            return false;
        }

        // 3. После последней точки есть 2 или более символов
        int lengthAfterDot = email.length() - 1 - dotIndexAfterAt;
        if (lengthAfterDot < 2) {
            System.out.println("Неверный адрес электронной почты, недостаточное колличество символов после последней . ");
            return false;
        }

        char symbol;
        // 4. Алфавит, цифры, '-', '_', '.', '@'
        for (int i = 0; i < email.length() - 1; i++) {
            symbol = email.charAt(i);
            if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_' || symbol == '.' || symbol == '@') {
                //легитимный символ
            } else {
                System.out.println("Неверный адрес электронной почты, обнаружен недопустимый символ" + symbol);
                return false;
            }
        }
        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) {
            System.out.println("Неверный адрес электронной почты, недостаточно символов до @");
            return false;
        }

        // 6. Первый символ - должна быть буква
        if (!Character.isLetter(email.charAt(0))) {
            System.out.println("Неверный адрес электронной почты, первым символом должна быть буква");
            return false;
        }


//        // Полезные методы класса Character
//        // Возвращает true если символ буква
//        Character.isAlphabetic('c');
//        // Возвращает true если символ цифра
//        Character.isDigit('1');
//        Character.isLetter('3');
//        Character.isLetterOrDigit('-');

        System.out.println("Емейл принят");

        return true;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    /*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */
    private boolean isPasswordValid(String password) {
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;

        //1. длина >= 8
        if (password.length() >= 8) b1 = true;

        //2. Должна быть мин 1 цифра
        char symbol;
        for (int i = 0; i < password.length() - 1; i++) {
            symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                b2 = true;
                break;
            }
        }

        //3. Должна быть мин 1 маленькая буква
        for (int i = 0; i < password.length() - 1; i++) {
            symbol = password.charAt(i);
            if (Character.isLowerCase(symbol)) {
                b3 = true;
                break;
            }
        }
        //4. Должна быть мин 1 большая буква
        for (int i = 0; i < password.length() - 1; i++) {
            symbol = password.charAt(i);
            if (Character.isUpperCase(symbol)) {
                b4 = true;
                break;
            }
        }

        //5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
        for (int i = 0; i < password.length() - 1; i++) {
            symbol = password.charAt(i);
            if (symbol == '!' || symbol == '%' || symbol == '$' || symbol == '@' || symbol == '&' || symbol == '*' || symbol == '(' || symbol == ')' || symbol == '[' || symbol == ']' || symbol == '.' || symbol == ',' || symbol == '-') {
                b5 = true;
                break;
            }
        }

        if (!(b1 && b2 && b3 && b4 && b5)) {
            System.out.println("Пароль не удовлетворяет требованиям: проверьте что у вас больше 8 символов, содержаться большие и маленькие буквы, содержаться цифры и специальные символы:! % $ @ & * () [] . , - ");
        }
        else {
            System.out.println("Пароль принят");
        }

        return b1 && b2 && b3 && b4 && b5;

    }
}



