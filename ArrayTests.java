import static org.junit.Assert.*;

import javax.management.openmbean.ArrayType;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {3,4,5};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{5,4,3}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1,2,3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input2)); 
  }
}
