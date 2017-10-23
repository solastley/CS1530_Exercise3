/**
* This is the test program for Exercise 3.
*/

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.IllegalArgumentException;

import exercise.Exercise;

public class ExerciseTest {

  @Test
  public void testTri1() {
    assertEquals(Exercise.tri(1), 1);
  }

  @Test
  public void testTri5() {
    assertEquals(Exercise.tri(5), 15);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testTriNegative() {
    Exercise.tri(-1);
  }

  @Test
  public void testCaterer1() {
    assertEquals(Exercise.lazyCaterer(1), 2);
  }

  @Test
  public void testCaterer4() {
    assertEquals(Exercise.lazyCaterer(4), 11);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCatererNegative() {
    Exercise.lazyCaterer(-1);
  }
}
