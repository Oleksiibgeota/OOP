package book.classes_and_objects.fifth;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
//        user.numericCode = 71;//некорректно - прямой доступ
        user.setNumericCode(71);
        // user.password = null; // поле недоступно
        user.setPassword(null); //корректно
        UserView.welcome(user);
    }
}