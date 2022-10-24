package util;

public class CurrencyCalculator {
    public static final double IOF = 1.06;

    public static double buyDollar(double priceDollar, double quantity) {
        quantity *= priceDollar;

        return quantity *= IOF;
    }
}
