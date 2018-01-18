package book.classes_and_objects.glava3.school;

public class Student extends Course {
    String cLastName;

    public Student(int levelCourse, String nameElective, String cLastName) {
        super(levelCourse, nameElective);
        this.cLastName = cLastName;
    }

    public String getcLastName() {
        return cLastName;
    }

    public void setcLastName(String cLastName) {
        this.cLastName = cLastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cLastName='" + cLastName + '\'' +
                '}';
    }
}
