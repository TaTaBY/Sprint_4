import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name == null) {
            return false;
        }

        String regex = "^(?=.{3,19}$)([a-zA-ZА-Яа-я]+ [a-zA-ZА-Яа-я+-]+)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
        //return name.matches("^(?=.{3,19}$)([a-zA-ZА-Яа-я]+\\s[a-zA-ZА-Яа-я+-]+)$");
            //old version
            //name.length() >= 3 && name.length() <= 19 && name.contains(" ") && !name.startsWith(" ")
            //&& !name.endsWith(" ") && name.indexOf(" ") == name.lastIndexOf(" ");
    }

}