package SOLIDPrinciples.D.Correct;

public class WiredMassager implements Massager{
    private boolean turnOn;
    public WiredMassager(boolean turnOn){
        this.turnOn = turnOn;
    }
    @Override
    public boolean powerStatus(){
        return this.turnOn;
    }
}
