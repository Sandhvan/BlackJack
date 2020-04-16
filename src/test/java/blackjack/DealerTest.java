package blackjack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DealerTest {

    public DealerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDealerID method, of class Dealer.
     */
    @Test
    public void testGetDealerID() {
        System.out.println("getDealerID");
        Dealer instance = new Dealer("123ABCD");
        String expResult = "123ABCD";
        String result = instance.getDealerID();
        System.out.println(result);
        assertEquals(expResult, result);

    }

    /**
     * Test of deal method, of class Dealer.
     */
    @Test
    public void testDealGood() {
        System.out.println("deal");
        GroupOfCards deck = new GroupOfCards(52 * 4);
        Dealer.deal(deck);

    }

    @Test
    public void testDealBoundary() {
        System.out.println("deal");
        GroupOfCards deck = new GroupOfCards(52);
        Dealer.deal(deck);

    }

    @Test
    public void testDealBad() {
        System.out.println("deal");
        GroupOfCards deck = new GroupOfCards(-23);
        Dealer.deal(deck);

    }

}
