package book.classes_and_objects.fifth;

public class User {
    private int numericCode;//нарушение инкапсуляции
    private String password;

    public void setNumericCode(int value) {
// можно указать условия ввода
        if(value > 0) numericCode = value;

        else numericCode = 1;
    }
    public int getNumericCode() {
        return numericCode;
    }
    public void setPassword(String pass) {
        if (pass != null) password = pass;
        else password = "11111";
    }
    public String getPassword() {
        //public String getPass() {//некорректно – неполное имя метода
        return password;
    }
}
