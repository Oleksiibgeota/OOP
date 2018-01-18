package book.classes_and_objects.glava3.school;

public class Course extends Elective {
    private int levelCourse;

    public Course(int levelCourse, String nameElective, String cLastName){
        this.levelCourse = levelCourse;
    }

    public  Course(int levelCourse, String nameElective){
        super(nameElective);
        this.levelCourse = levelCourse;
    }
    public  int getLevelCourse(){
        return levelCourse;
    }

    public void setLevelCourse(int levelCourse) {
        this.levelCourse = levelCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "levelCourse='" + levelCourse + '\'' +
                '}';
    }

    @Override
    public String getNameElective() {
        return super.getNameElective();
    }
}
