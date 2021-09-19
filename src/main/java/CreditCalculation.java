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
        double P = percent / 100 / 12;
        return (int) (credit * (P + (P / ((Math.pow((1 + P), period) - 1)))));

    }

    public int refundAmount(int payment) {

        return period * payment;
    }

    public int myOverpayment(int sum) {

        return sum - credit;
    }
}
