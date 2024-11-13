package lesson_45;

public class PasswordValidatorException extends Exception{
    public PasswordValidatorException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}
