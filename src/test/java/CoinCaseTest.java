import org.junit.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CoinCaseTest {

    @Test
    public void addCoinsTest() {
        CoinCase coinCase = new CoinCase();
        assertEquals(0,coinCase.getCount(100));
        coinCase.addCoins(100, 100);
        coinCase.addCoins(10, 0);
        coinCase.addCoins(1, -10);
        assertEquals(100,coinCase.getCount(100));
        assertEquals(0,coinCase.getCount(10));
        assertEquals(-10,coinCase.getCount(1));
    }

    @Test
    public void getCountTest() {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(100, 100);
        coinCase.addCoins(10, 0);
        coinCase.addCoins(1, -10);
        assertEquals(100,coinCase.getCount(100));
        assertEquals(0,coinCase.getCount(10));
        assertEquals(-10,coinCase.getCount(1));
    }

    @Test
    public void getAmountTest() {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(100, 100);
        coinCase.addCoins(10, 0);
        coinCase.addCoins(1, 1);
        assertEquals(10001,coinCase.getAmount());
    }

    @Test
    public void getTotalCountTest() {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(100, 100);
        coinCase.addCoins(10, 0);
        coinCase.addCoins(1, 1);
        assertEquals(101,coinCase.getTotalCount());
    }

    @Test
    public void getKeyTest() {
        CoinCase coinCase = new CoinCase();
        Set key = coinCase.getKey();
        assertTrue(key.contains(10));
        assertFalse(key.contains(10.0));
    }
}