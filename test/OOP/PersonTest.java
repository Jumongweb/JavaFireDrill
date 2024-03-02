package OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testAddProblem(){
        Person person = new Person();
        Problem problem1 = new Problem("Love", Type.SPIRITUAL);
        person.add(problem1);
        assertEquals(1, person.getSize());
    }

    @Test
    public void testSolveProblem(){
        Person person = new Person();
        Problem problem1 = new Problem("Semicolon loan", Type.FINANCIAL);
        person.add(problem1);
        assertEquals(1, person.getSize());

        person.solve(problem1);
        assertEquals(0, person.getSize());
    }

    @Test
    public void testHaveTwoProblemSolve1(){
        Person person = new Person();
        Problem problem1 = new Problem("Semicolon loan", Type.FINANCIAL);
        person.add(problem1);
        Problem problem2 = new Problem("Chibuzor", Type.EDUCATION);
        person.add(problem2);
        assertEquals(2, person.getSize());
        person.solve(problem1);
        assertEquals(1, person.getSize());
    }

    @Test
    public void testPersonCanAll4Problem(){
        Person person = new Person();
        Problem problem1 = new Problem("Village people", Type.SPIRITUAL);
        Problem problem2 = new Problem("Chibuzor", Type.EDUCATION);
        Problem problem3 = new Problem("Semicolon loan", Type.FINANCIAL);
        Problem problem4 = new Problem("Your Ex is your boss", Type.BUSINESS);
        person.add(problem1);
        person.add(problem2);
        person.add(problem3);
        person.add(problem4);
        assertEquals(4, person.getSize());
    }
}
