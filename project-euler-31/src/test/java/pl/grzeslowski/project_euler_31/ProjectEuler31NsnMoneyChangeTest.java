package pl.grzeslowski.project_euler_31;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProjectEuler31NsnMoneyChangeTest {
    private final int in;
    private final long out;

    public ProjectEuler31NsnMoneyChangeTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 1 }, { 2, 2 },
                { 5, 4 } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final ProjectEuler31NsnMoneyChange euler = new ProjectEuler31NsnMoneyChange();

        // when
        final long waysToChangeCoin = euler.waysToChangeCoin(in);

        // then
        Assertions.assertThat(waysToChangeCoin).isEqualTo(out);
    }
}
