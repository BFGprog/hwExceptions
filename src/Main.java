import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        ServiceException serviceException = new ServiceException();

        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "__D_1hWiKjjP_9";


        try {
            serviceException.checkLogin(login);
        } catch (WrongLoginException e) {
            System.out.println("WrongLogin");
        }
        finally {
            System.out.println("введен логин");
        }

        try {
            serviceException.checkPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("WrongPassword");
        }
        finally {
            System.out.println("введен пароль");
        }
//        if(serviceException.checkLogin(login)){
//            throws new RuntimeException("WrongLoginException");
//        } else {
//            System.out.println("works");
//        }


    }
}