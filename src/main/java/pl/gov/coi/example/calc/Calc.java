package pl.gov.coi.example.calc;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {
    // Test
    public int add(int a, int b) {
        if (a > 6) {
            return (-2 * a) + b;
        }
        return a + b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
