
import com.goodline.homework.Homework;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTest {

    @Test
    public void printEvenTest_containsEven() {
        int[] testData = {1, 2, 3, 4, 6, 7, 8, 3, 3};
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, Homework.printEven(testData));
    }
    @Test
    public void printEvenTest_notContainsEven() {
        int[] testData = {1, 3, 5, 5, 7, 9, 3, 3};
        int[] expected = {};
        assertArrayEquals(expected, Homework.printEven(testData));
    }
    @Test
    public void printEvenTest_ContainsOnlyEven() {
        int[] testData = {2, 4, 6, 8};
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, Homework.printEven(testData));
    }

    @Test
    public void getCount_3_9_7_14_21_63_147_1_2(){
        int[] testData = {3, 9, 7, 14, 21, 63, 147, 1, 2};
        int expected = 3;
        assertEquals(expected, Homework.getCount(testData));
    }

}
