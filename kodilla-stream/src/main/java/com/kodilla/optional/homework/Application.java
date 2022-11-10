package com.kodilla.optional.homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jan Nowak",(new Teacher("Zbigniew Zasada"))));
        studentList.add(new Student("Tomasz Sowa",(new Teacher("Adam Kowalski"))));
        studentList.add(new Student("Kamil Kot",null));
        studentList.add(new Student("Karol Lis",(new Teacher("Adam Kowalski"))));
        studentList.add(new Student("Maciej Tomczyk", null));


        Student student = new Student("name",new Teacher("name"));
        Student jan = new Student("Jan Nowak",(new Teacher("Zbigniew Zasada")));
        Student tomasz = new Student("Tomasz Sowa",(new Teacher("Adam Kowalski")));
        Student kamil = new Student("Kamil Kot",null);
        Student karol = new Student("Karol Lis",(new Teacher("Adam Kowalski")));
        Student maciej = new Student("Maciej Tomczyk", null);

        Teacher janTeacher = Optional.ofNullable(jan.getTeacher()).orElse(new Teacher("undefined"));
        janTeacher.getName();
        System.out.println(janTeacher.getName());
        Teacher tomaszTeacher = Optional.ofNullable(tomasz.getTeacher()).orElse(new Teacher("undefined"));
        tomaszTeacher.getName();
        System.out.println(tomaszTeacher.getName());
        Teacher kamilTeacher = Optional.ofNullable(kamil.getTeacher()).orElse(new Teacher("undefined"));
        kamilTeacher.getName();
        System.out.println(kamilTeacher.getName());
        Teacher karolTeacher = Optional.ofNullable(karol.getTeacher()).orElse(new Teacher("undefined"));
        karolTeacher.getName();
        System.out.println(karolTeacher.getName());
        Teacher maciejTeacher = Optional.ofNullable(maciej.getTeacher()).orElse(new Teacher("undefined"));
        maciejTeacher.getName();
        System.out.println(maciejTeacher.getName());
    }
    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.orElse(new Teacher("undefined")).getName();
        return teacherName;
    }
}
