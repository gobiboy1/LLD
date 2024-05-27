package SOLIDPrinciples.D.Correct;

public class MassageTherapy {
    private final LivingBeingsMassage livingBeingsMassage;
    private final Massager massager;

    public MassageTherapy(LivingBeingsMassage livingBeingsMassage, Massager massager){
        this.livingBeingsMassage = livingBeingsMassage;
        this.massager = massager;
        System.out.println("Massage type: "+this.livingBeingsMassage.massageType() + ", Power Status: " + this.massager.powerStatus());
    }
}
