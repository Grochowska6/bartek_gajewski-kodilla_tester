package com.kodilla.optional.homework;

import com.kodilla.collections.adv.maps.complex.Student;
import com.kodilla.collections.adv.maps.homework.School;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testAddStudent() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jan Nowak",("Zbigniew Zasada")));
        assertEquals(1,students.size());

    }
    @Test
    public void testTeacherUndefined() {
        Student kamil = new Student("Kamil Kot", null);
        assertEquals("<undefined>",Application.getTeacxherName(kamil);
    }


}
