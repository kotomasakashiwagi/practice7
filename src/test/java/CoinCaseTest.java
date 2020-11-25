import org.junit.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CoinCaseTest {

    @Test
    public void addCoinsTest() {
        CoinCase coinCase = new CoinCase();
        assertEquals(0,coinCase.getCount(Coin.Hundred));
        coinCase.addCoins(Coin.Hundred, 100);
        coinCase.addCoins(Coin.Ten, 0);
        coinCase.addCoins(Coin.One, -10);
        assertEquals(100,coinCase.getCount(Coin.Hundred));
        assertEquals(0,coinCase.getCount(Coin.Ten));
        assertEquals(-10,coinCase.getCount(Coin.One));
    }

    @Test
    public void getCountTest() {
        CoinCase coinCase = new CoinCase();
        assertEquals(0,coinCase.getCount(Coin.Hundred));
        coinCase.addCoins(Coin.Hundred, 100);
        coinCase.addCoins(Coin.Ten, 0);
        coinCase.addCoins(Coin.One, -10);
        assertEquals(100,coinCase.getCount(Coin.Hundred));
        assertEquals(0,coinCase.getCount(Coin.Ten));
        assertEquals(-10,coinCase.getCount(Coin.One));
    }

    @Test
    public void getAmountTest() {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(Coin.Hundred, 100);
        coinCase.addCoins(Coin.Ten, 0);
        coinCase.addCoins(Coin.One, 1);
        assertEquals(10001,coinCase.getAmount());
    }

    @Test
    public void getTotalCountTest() {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(Coin.Hundred, 100);
        coinCase.addCoins(Coin.Ten, 0);
        coinCase.addCoins(Coin.One, 1);
        assertEquals(101,coinCase.getTotalCount());
    }

    @Test
    public void getKeyTest() {
        CoinCase coinCase = new CoinCase();
        Set<Coin> key = coinCase.getKey();
        assertTrue(key.contains(10));
    }
}