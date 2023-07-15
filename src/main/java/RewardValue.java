
public class RewardValue {
    private double cashValue;
    private double milesValue;

    public static final double conversionRate = 0.0035

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * conversionRate;
    }


    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
