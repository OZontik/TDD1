public class CreditCalculation {
    private int credit;
    private double percent;
    private int period;

    public CreditCalculation(int credit, double percent, int period) {
        this.credit = credit;
        this.percent = percent;
        this.period = period;
    }
    public int myPayment() {

        return 1;

    }

    public int refundAmount(int payment) {

        return payment;
    }

    public int myOverpayment(int sum) {

        return sum;
    }
}
