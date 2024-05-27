package SOLIDPrinciples.D.Correct;

public class Cat implements LivingBeingsMassage {
    private String massageType;
    public Cat(String massageType){
        this.massageType = massageType;
    }
    @Override
    public String massageType(){
        return this.massageType;
    }
}
