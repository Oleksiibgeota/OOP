package book.classes_and_objects.glava3.school_1_1;

public class Student {
   private int id;
    String lastName;
    String firstName;
    int birthday;
    String address;
    String elective;
    String course;
    String group;

    public Student(int newId, String newLastName, String newFirstName, String newElective, String newCourse, String newGroup) {
         id = newId;
        lastName = newLastName;
        firstName = newFirstName;
        elective = newElective;
        course = newCourse;
        group = newGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getElective() {
        return elective;
    }

    public void setElective(String elective) {
        this.elective = elective;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return ("id student" +  getId() + " Last Name " + lastName + " First name" +
                " " + firstName + " elective " + getElective()) +" #group " + getGroup() +
                " course "+getCourse() ;
    }
}
