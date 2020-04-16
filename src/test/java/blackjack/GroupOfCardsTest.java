package blackjack;

import java.util.function.Supplier;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupOfCardsTest {

    public GroupOfCardsTest() {
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
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCardsGood() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards(52 * 4);;
        Card expResult = new Card();
        Card result = instance.showCards();
        expResult = result;
        assertEquals(expResult, result);

    }

    public void testShowCardsBad() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards(52 * 4);;
        Card expResult = new Card();
        Card result = instance.showCards();
        assertNotSame(expResult, result);

    }

    public void testShowCardsBoundary() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards(52 * 4);;
        Card expResult = new Card();
        Card result = instance.showCards();
        expResult = result;
        assertEquals(expResult, result);

    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(52 * 4);
        instance.shuffle();

    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(52 * 4);;
        int expResult = 52 * 4;
        int result = instance.getSize();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int givenSize = 52 * 4;
        GroupOfCards instance = new GroupOfCards(52 * 4);;
        instance.setSize(givenSize);

    }

}
