public class Main {
    public static void main(String[] args) {
        int credit = 200000;
        double percent = 12;
        int period = 24;
        CreditCalculation creditCalculation = new CreditCalculation(credit, percent, period);

        int payment = creditCalculation.myPayment();
        System.out.println(payment);

        int sum = creditCalculation.refundAmount(payment);
        System.out.println("общая сумма к возврату в банк: " + sum);

        int overpayment = creditCalculation.myOverpayment(sum);
        System.out.println("переплата за весь период: " + overpayment);
    }
}