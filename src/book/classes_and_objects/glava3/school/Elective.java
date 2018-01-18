package book.classes_and_objects.glava3.school;

public class Elective {
    private String nameElective;
    public  Elective(){}

    public Elective(String nameElective) {
        this.nameElective = nameElective;
    }

    public String getNameElective() {
        return nameElective;
    }

    public void setNameElective(String nameElective) {
        this.nameElective = nameElective;
    }

    @Override
    public String toString() {
        return "Elective{" +
                "nameElective='" + nameElective + '\'' +
                '}';
    }
}
