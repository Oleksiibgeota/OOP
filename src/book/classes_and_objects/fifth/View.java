package book.classes_and_objects.fifth;

class UserView {
    public static void welcome(User obj) {
        System.out.printf("Привет! Введен код: %d, пароль: %s",
                obj.getNumericCode(), obj.getPassword());
    }
}


