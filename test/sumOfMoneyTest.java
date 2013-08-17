import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sumOfMoneyTest {

    @Test
    public void should_give_one_arrangement_for_one_paisa() throws Exception {
        assertEquals(1,new sumOfMoney(0.01).giveArrangementsOfMoney(0,0));
    }

    @Test
    public void should_give_2_arrangements_for_2_paisa()
    {
        assertEquals(2,new sumOfMoney(0.02).giveArrangementsOfMoney(0,0));
    }

    @Test
    public void should_give_4_arrangements_for_5_paisa() throws Exception {
        assertEquals(4,new sumOfMoney(0.05).giveArrangementsOfMoney(0, 0));
    }

}
