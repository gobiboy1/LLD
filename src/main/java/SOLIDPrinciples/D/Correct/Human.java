package SOLIDPrinciples.D.Correct;

public class Human implements LivingBeingsMassage {
    private String massageType;
    public Human(String massageType){
        this.massageType = massageType;
    }
    @Override
    public String massageType(){
        return this.massageType;
    }
}
