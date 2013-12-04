package pl.grzeslowski.project_euler_31;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CoinFactory_getCoin {
    private final int in;
    private final int out;

    public CoinFactory_getCoin(final int in, final int out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 0 }, { 2, 1 },
                { 5, 2 }, { 10, 5 },
                { 20, 10 },
                { 50, 20 }, { 100, 50 }, { 200, 100 } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final CoinFactory factory = new CoinFactory();

        // when
        final int nextCoin = factory.getNextCoin(in);

        // then
        Assertions.assertThat(nextCoin).isEqualTo(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegal_coin() {

        // given
        final CoinFactory factory = new CoinFactory();

        // when
        factory.getNextCoin(3);

        // then
    }
}
