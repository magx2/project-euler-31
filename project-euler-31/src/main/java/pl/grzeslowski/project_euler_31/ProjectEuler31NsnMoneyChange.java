package pl.grzeslowski.project_euler_31;

public class ProjectEuler31NsnMoneyChange implements ProjectEuler31 {

    private final CoinFactory coinFactory = new CoinFactory();

    @Override
    public long waysToChangeCoin(final int coin) {
        return waysToChangeCoin(coin, coinFactory.getNextCoin(coin));
    }

    private long waysToChangeCoin(final int coin, final int coinToUse) {
        if (coinToUse == 1) {
            return 1L;
        } else if (coin == 0) {
            return 1L;
        } else if (coin < 0) {
            return 0;
        } else if (coinToUse == 0) {
            return 0L;
        } else {

            // left side uses coinToUse
            final long left = waysToChangeCoin(coin - coinToUse, coinToUse);

            // right side does not use cointToUse
            final long right = waysToChangeCoin(coin,
                    coinFactory.getNextCoin(coinToUse));

            return left + right;
        }
    }

}
