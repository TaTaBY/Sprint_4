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
        try {
            return name.matches("[a-zA-ZА-Яа-я]{1,9} [a-zA-ZА-Яа-я]{1,9}");
            //old version
            //name.length() >= 3 && name.length() <= 19 && name.contains(" ") && !name.startsWith(" ")
            //&& !name.endsWith(" ") && name.indexOf(" ") == name.lastIndexOf(" ");
        } catch (Exception e) {
            return false;
        }

    }

}