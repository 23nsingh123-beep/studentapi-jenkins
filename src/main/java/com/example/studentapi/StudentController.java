package com.example.studentapi;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully";
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(student.getName());
                s.setCourse(student.getCourse());
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return "Student deleted successfully";
            }
        }
        return "Student not found";
    }
}
