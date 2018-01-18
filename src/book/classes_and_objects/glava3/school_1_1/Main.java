package book.classes_and_objects.glava3.school_1_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student petrov = new Student(1234, "Petrov", "Petr", "PGS", "2", "210");
        Student ivanov = new Student(1233, "Ivanov", "Vano", "PGS", "2", "210");
        Student sidorov = new Student(1229, "Sidorov", "Senja", "PGS", "3", "310");
        Student sidorova = new Student(1230, "Sidorova", "Sonja", "PGS", "3", "310");
        Student slepakov = new Student(1232, "Slepakov", "Senja", "PGS", "2", "210");
        Student bublik = new Student(1227, "Bublik", "Kolja", "BUH", "2", "215");


        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(petrov);
        studentsArrayList.add(ivanov);
        studentsArrayList.add(sidorov);
        studentsArrayList.add(sidorova);
        studentsArrayList.add(slepakov);
        studentsArrayList.add(bublik);


        for (int i = 0; i < 1; i++) {
            System.out.println(studentsArrayList.toString());
        }


        System.out.println("---------");



        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner stopScanner = new Scanner(System.in);

        System.out.println("Enter id Student for print them: ");

//        String stop = "stop";
        int stop = 1;
        int count = 0;
        while (stop == 1) {
            int id = scanner.nextInt();
            for (int i = 0; i < studentsArrayList.toArray().length; i++) {
                if (studentsArrayList.get(i).getId() == id) {
                    System.out.println(studentsArrayList.get(i).getId() + " " + studentsArrayList.get(i).lastName +
                            studentsArrayList.get(i).firstName + "elective" + studentsArrayList.get(i).getElective() +
                            " " + "group " + studentsArrayList.get(i).getGroup() + "  course " + studentsArrayList.get(i).getCourse());
                } else {
                    count++;
                    if (count == studentsArrayList.toArray().length) {
                        System.out.println("no id");
                        count = 0;
                    }
                }
            }
            System.out.println("________________________");
            System.out.println("Exit <<0>>   next student <<1>> ");
            stop = stopScanner.nextInt();
        }

// сортировка по id произошла тут
        studentsArrayList.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() == o2.getId()) return 0;
                else if (o1.getId() > o2.getId()) return 1;
                else return -1;
            }
        });
        System.out.println("-----------");
        System.out.println("Students sorting by id ");
//____________________________________________________________________
        for (int i = 0; i < studentsArrayList.toArray().length; i++) {
            System.out.println(studentsArrayList.get(i).getId() + " " + studentsArrayList.get(i).lastName);
        }

        System.out.println("----------");
        System.out.println("Details about one`s student (for ex. Bublik)");
// вывод фамилии и id
        for (int i = 0; i < studentsArrayList.toArray().length; i++) {
            if (studentsArrayList.get(i).lastName == "Bublik") {
                System.out.println(studentsArrayList.get(i).getId() + " " + studentsArrayList.get(i).lastName);
            }
        }

// сортировка по имени
        for (int i = 0; i < studentsArrayList.toArray().length; i++) {
            if (studentsArrayList.get(i).lastName == "Bublik") {
                System.out.println(studentsArrayList.get(i).toString());
            }
        }

// sort by name
        System.out.println("-----------");
        System.out.println("Sort students by name elective and number course: ");
        for (int i = 0; i < studentsArrayList.toArray().length; i++) {
            if (studentsArrayList.get(i).getElective() == "PGS" && studentsArrayList.get(i).getCourse() == "2") {
                System.out.println(studentsArrayList.get(i).toString());
            }
        }

    }
}