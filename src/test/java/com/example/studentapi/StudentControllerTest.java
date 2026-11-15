
package com.example.studentapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testAddStudent() {
        StudentController controller = new StudentController();

        Student student = new Student(1, "Rahul", "CSE");

        String result = controller.addStudent(student);

        assertEquals("Student added successfully", result);
        assertEquals(1, controller.getStudents().size());
    }

    @Test
    void testGetStudent() {
        StudentController controller = new StudentController();

        controller.addStudent(new Student(1, "Rahul", "CSE"));

        Student student = controller.getStudent(1);

        assertNotNull(student);
        assertEquals("Rahul", student.getName());
    }
}
