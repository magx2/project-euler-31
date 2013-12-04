package pl.grzeslowski.project_euler_31;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CoinFactory_hasCoin {
    private final int in;
    private final boolean out;

    public CoinFactory_hasCoin(final int in, final boolean out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, true }, { 2, true },
                { 3, false }, { 4, false }, { 5, true }, { 10, true },
                { 20, true },
                { 50, true }, { 100, true }, { 200, true } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final CoinFactory factory=new CoinFactory();

        // when
        final boolean hasCoin = factory.hasCoin(in);

        // then
         Assertions.assertThat(hasCoin).isEqualTo(out);
    }
}
