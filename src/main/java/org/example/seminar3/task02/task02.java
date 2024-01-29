package org.example.seminar3.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2.	Дан массив объектов: фамилия студента, номер группы, размер стипендии,
//баллы по 3 предметам. Определить стипендии студентов, фамилии которых
//заканчиваются на «ова», при четной сумме баллов.
public class task02 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Petrov", 101, 5000, Arrays.asList(5, 4, 3)),
                new Student("Smirnova", 102, 5000, Arrays.asList(5, 4, 3)),
                new Student("Ivanov", 103, 5000, Arrays.asList(5, 4, 3)),
                new Student("Sidorov", 101, 5000, Arrays.asList(5, 4, 3))));

        for (Student student : studentList){
            if (student.getSurname().endsWith("ova") && student.evenGrades()){
                System.out.println("student.getSurname() = " + student.getSurname());
                System.out.println("Stipa = " + student.getStipendia());
            }
        }

    }
}
