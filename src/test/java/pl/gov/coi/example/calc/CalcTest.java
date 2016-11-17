package pl.gov.coi.example.calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class CalcTest {
    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 4;
        Calc calc = new Calc();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(9, result);
    }

}