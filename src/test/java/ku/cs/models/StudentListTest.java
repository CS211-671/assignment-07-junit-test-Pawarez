package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList student;
    @BeforeEach
    void init() {
        student = new StudentList();
        student.addNewStudent("6610xxxxxx", "Jay1");
        student.addNewStudent("6611xxxxxx", "Jay2", 50);
    }

    @Test
    @DisplayName("Test find by id")
    void testFindById() {
        student.addNewStudent("6610xxxxxx", "Jay1");
        assertNull(student.findStudentById(null));
        assertEquals("Jay1", student.findStudentById("6610xxxxxx").getName());

    }

    @Test
    @DisplayName("Test give score by id")
    void testGiveScoreById() {
        student.addNewStudent("6610xxxxxx", "Jay1");
        student.giveScoreToId("6610xxxxxx",50);
        assertEquals(50, student.findStudentById("6610xxxxxx").getScore());
    }


    @Test
    @DisplayName("Test view grade by id")
    void testViewGradeById() {
        student.addNewStudent("6610xxxxxx", "Jay1");
        student.giveScoreToId("6610xxxxxx",80);
        assertEquals("A", student.findStudentById("6610xxxxxx").grade());
    }

    @Test
    @DisplayName("Test get students")
    void testGetStudents() {
        student.addNewStudent("6610xxxxxx", "Jay1");
        assertEquals("Jay1", student.getStudents().get(0).getName());
    }


}