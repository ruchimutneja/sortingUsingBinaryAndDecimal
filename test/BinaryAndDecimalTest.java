import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BinaryAndDecimalTest {

    @Test
    public void should_give_binary_value_of_one() throws Exception {
        assertArrayEquals(new Integer[]{1}, new BinaryValue().generateBinaryNumber(1));
    }

    @Test
    public void should_give_binary_value_of_two() throws Exception {
        assertArrayEquals(new Integer[]{0, 1}, new BinaryValue().generateBinaryNumber(2));
    }

    @Test
    public void should_give_binary_value_of_three() throws Exception {
        assertArrayEquals(new Integer[]{1, 1}, new BinaryValue().generateBinaryNumber(3));
    }

    @Test
    public void should_count_number_of_ones() throws Exception {
        assertEquals(1, new BinaryValue().countNumberOfOne(1));
    }

    @Test
    public void should_count_number_of_five() throws Exception {
        assertEquals(2, new BinaryValue().countNumberOfOne(5));

    }

    @Test
    public void should_sort_1_and_2_by_their_number_of_ones_and_decimal_value() throws Exception {
        assertArrayEquals(new Integer[]{1, 2}, new BinaryAndDecimal().sorting(new Integer[]{1, 2}));
    }

    @Test
    public void should_sort_2_and_1_by_their__number_of_ones_and_decimal_value() throws Exception {
        assertArrayEquals(new Integer[]{1,2}, new BinaryAndDecimal().sorting(new Integer[]{2,1}));
    }

    @Test
    public void should_sort_7_4_2_by_their__number_of_ones_and_decimal_value() throws Exception {
        assertArrayEquals(new Integer[]{2,4,7}, new BinaryAndDecimal().sorting(new Integer[]{7,4,2}));
    }
}