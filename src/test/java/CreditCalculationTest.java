import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCalculationTest {
    @Test
    void testPayment() {
        int credit = 200000;
        double percent = 12;
        int period = 24;
        double P = percent / 100 / 12;
        double payment = credit * (P + (P / ((Math.pow((1 + P), period) - 1))));
        int expected = (int) payment;
        int actualResult = new CreditCalculation(credit, percent, period).myPayment();

        assertEquals(expected, actualResult);
    }

    @Test
    void testRefundAmount() {
        int credit = 200000;
        double percent = 12;
        int period = 24;
        int payment = 9500;
        int expected = period * payment;
        int actualResult = new CreditCalculation(credit, percent, period).refundAmount(payment);

        assertEquals(expected, actualResult);
    }

    @Test
    void testOverpaymentCalc() {
        int credit = 200000;
        double percent = 12;
        int period = 24;
        int sum = 225000;
        int expected = sum - credit;
        int actualResult = new CreditCalculation(credit, percent, period).myOverpayment(sum);

        assertEquals(expected, actualResult);
    }

}
