package students;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {
    private Student student;

    @Before
    public void setUp(){
        student = new Student("Bob", 7);
        student.addGrade(78,89,90);
    }

    @Test
    public void  testGetID(){
        assertEquals(7, student.getId());
    }
    @Test
    public void testgetName() {
        assertEquals("Bob", student.getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(3, student.getGrades().size());
    }

    @Test
    public void testGetGrades(){
//       int[] gradesArray = new int [] {78,89,90};
//        assertSame(78, student.getGrades().get(0));
        assertEquals("[78, 89, 90]", student.getGrades().toString());
        System.out.println(student.getGrades().toString());
    }

    @Test
    public void testGetGradeAverage(){
//        student.addGrade(77,89);
        assertEquals(85.0, student.getGradeAverage());
    }
}
