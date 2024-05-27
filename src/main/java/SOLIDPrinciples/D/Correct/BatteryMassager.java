package SOLIDPrinciples.D.Correct;

public class BatteryMassager implements Massager{
    private boolean turnOn;
    public BatteryMassager(boolean turnOn){
        this.turnOn = turnOn;
    }
    @Override
    public boolean powerStatus(){
        return this.turnOn;
    }
}
