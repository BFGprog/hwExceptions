import exception.WrongLoginException;
import exception.WrongPasswordException;

public class ServiceException {

    public void checkLogin(String login) throws WrongLoginException {
        boolean matches = login.matches("[a-zA-Z0-9_]{8,20}");

        if (!matches) {
            throw new WrongLoginException();
//            System.out.println("Ошибка");
        }
    }

    public void checkPassword(String pas, String confirmPas) throws WrongPasswordException {
        boolean matches = pas.matches("[a-zA-Z0-9_]{8,20}");
        if (!matches || !pas.equals(confirmPas)) {
            throw new WrongPasswordException();
        }


    }

//    public void checkPassword(String login) {
//        char[] a = login.toCharArray();
//        for (int i = 0; i < login.length(); i++) {
//            if (!Character.isLetter(a[i])) {
//                return false;
//                // WrongLoginException
//            }
//        }
//        return true;


}
