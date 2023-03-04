import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*  Создайте программу имитирующую регистрацию на какой-то сайт. (например
        Instagram).
        При регистрации зарпашивается имя, фамилия, возвраст, электронная почта и пароль.
                Учтите всевозможные не предвиденные случаи(Exception). При вводе возвраста
        пользователь должен вводить только цифры, иначе выбрасывается исключение. При
        вводе электронной почты должны проверять содержится ли знак '@', а если нет
        выбрасывается (BadRequestException). При вводе пароля, проверяете длину, то есть
        пароль должен содержать минимум 7 символов, иначе выбрасывается исключение
        (BadRequestException).

                Создайте пакет exceptions там будут ваши классы наследовавшие классы исключений.
                В main запустите вашу программу.
        Обработайте исключения!*/
        try {
            while (true) {
                Person person = new Person();
                System.out.println("Write a first name");
                String firstName = new Scanner(System.in).nextLine();
                person.setFirstName(firstName);
                System.out.println("Write a last name");
                String lastName = new Scanner(System.in).nextLine();
                person.setLastName(lastName);
                System.out.println("Write a age");
                int age = new Scanner(System.in).nextInt();
                if (age > 0) {
                    person.setAge(age);
                } else {
                    throw new Exceptions("Age must be above zero");
                }
                System.out.println("Write a gmail");
                String gmail = new Scanner(System.in).nextLine();
                if (gmail.contains("@")) {
                    person.setGmail(gmail);
                } else {
                    throw new BadRequestException("There is no @ in the gmail ");
                }
                person.setGmail(gmail);
                System.out.println("Write a password");
                String password = new Scanner(System.in).nextLine();
                if (password.length() > 7) {
                    person.setPassword(password);
                } else {
                    throw new BadRequestException("Password length is less than 7 symbols ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    