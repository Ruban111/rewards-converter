public class RewardValue {
    public double cashValue, miles;
    public final double rate = 0.0035;
    public RewardValue (double cashValue){
        this.cashValue = cashValue;
        this.miles = cashValue/rate;

    }
    public RewardValue(double miles, boolean isMiles){
        if(isMiles){
            this.miles = miles;
            this.cashValue = miles*rate;
        }
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue(){
        return miles;
    }
}
