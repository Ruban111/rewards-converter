public class RewardValue {
    public double cashValue;
    public final double rate = 0.0035;
    public RewardValue (double cashValue){
        this.cashValue = cashValue;


    }
    public RewardValue(int miles){
        this.cashValue = converTOCash(miles);

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
