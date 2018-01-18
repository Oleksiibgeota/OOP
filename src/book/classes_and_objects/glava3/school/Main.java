package book.classes_and_objects.glava3.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elective pgs2 = new Course(2, "PGS2");
//        Course pgs = (Course) pgs2;
//        System.out.println(pgs);
        Course pgs3 = new Course(2, "pgs3");
        Student ivanov = new Student(3, "pgs", "Ivanov");
        Student petrov = new Student(3, "pgs", "Petrov");
        Student sidorov = new Student(2, "pgs", "Sidorov");

        List students = new ArrayList();
        students.add(ivanov);
        students.add(petrov);
        students.add(sidorov);

        System.out.println();

        System.out.println(pgs3);
        System.out.println(pgs2);
        System.out.println("number course: " + ivanov.getLevelCourse());
        System.out.println("name of group: " + ivanov.getNameElective());
        System.out.println("Last name: " + ivanov.cLastName);
        System.out.println("----------");
        System.out.println(students);
    }
}
