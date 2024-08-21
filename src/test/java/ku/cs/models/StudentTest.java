package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบว่าIDเหมือนกันมั้ย")
    void testIsId(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertTrue(s.isId("6xxxxxxxx"));
    }

    @Test
    @DisplayName("ทดสอบวา่าชื่อเหมือนมั้ย")
    void testGetId() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertEquals("6xxxxxxxx", s.getId());

    }

    @Test
    @DisplayName("ทดสอบว่าScoreเหมือนมั้ย")
    void testGetScore() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertEquals(0.0, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบว่าเปลี่ยนชื่อเเล้วเหมือนมั้ย")
    void testChangeName(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.changeName("Jay");
        assertEquals("Jay", s.getName());
    }

    @Test
    @DisplayName("ทดสอบว่าชื่อเเล้วเหมือนมั้ย")
    void testGetName(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertEquals("StudentTest", s.getName());
    }

    @Test
    @DisplayName("ทดสอบToString")
    void testToString(){
        Student s = new Student("6xxxxxxxx", "StudentTest",0.0);
        assertEquals("{id: '6xxxxxxxx', name: 'StudentTest', score: 0.0}", s.toString());
    }
}