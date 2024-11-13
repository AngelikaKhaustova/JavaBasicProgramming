package lesson_45;

public class ValidateApp {
    public static void main(String[] args) {

        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "te!st@email.com";
        String password = "nnnn";

        // Валидация email
        try {
            EmailValidator.isEmailValid(email);
            // Если мы дойдем до этой строчки кода,
            // значит email валидный
            System.out.println("Email прошел проверку");
            // User user = new User(email, password)
        } catch (EmailValidateException e) {
            // email не прошел проверку.
            // Запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        // короткий пароль
        try{
            EmailValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");
        } catch (PasswordValidatorException e) {
            System.out.println("Password is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        // нет заглавной буквы
        password = "fad123^*kjf";
        try{
            EmailValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");
        } catch (PasswordValidatorException e) {
            System.out.println("Password is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        // нет маленькие буквы
        password = "FGE123%^&ER";
        try{
            EmailValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");

        } catch (PasswordValidatorException e) {
            System.out.println("Password is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }
        //нет спец символа
        password = "FGE123jkndf";
        try{
            EmailValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");
        } catch (PasswordValidatorException e) {
            System.out.println("Password is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
