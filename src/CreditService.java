public class CreditService {
    public int calculate(int loan, int years, double benefit) {
        double monthPay;
        double monthPercent = benefit / (100 * 12);
        monthPay = loan * (monthPercent / (1 - Math.pow(1 + monthPercent, years * 12 * (-1))));
        return (int) monthPay;
    }

}
