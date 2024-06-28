public class RewardValue {
    public double cashValue, miles;
    public final double rate = 0.0035;
    public RewardValue (double cashValue){
        this.cashValue = cashValue;
        this.miles = cashValue/rate;

    }
    public RewardValue(int miles){

            this.miles = miles;
            this.cashValue = miles*rate;

    }
    public int converTOMiles(double cashVal){
        return (int)(cashVal/rate);
    }
    public double converTOCash(int milesValue){
        return milesValue*rate;
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue(){
        return converTOMiles(this.cashValue);
    }
}
