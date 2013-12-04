package pl.grzeslowski.project_euler_31;

import java.util.ArrayList;
import java.util.List;

public final class CoinFactory {

    private final List<Integer> coins = new ArrayList<>();

    public CoinFactory() {
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);
        coins.add(20);
        coins.add(50);
        coins.add(100);
        coins.add(200);
    }

    public boolean hasCoin(final int coin) {
        return coins.contains(coin);
    }

    public int getNextCoin(final int coin) {
        int lastCoin = 0;

        for (final Integer c : coins) {
            if (coin == c) {
                return lastCoin;
            } else {
                lastCoin = c;
            }
        }

        throw new IllegalArgumentException("Dont have this coin = {" + coin
                + "}");
    }
}
