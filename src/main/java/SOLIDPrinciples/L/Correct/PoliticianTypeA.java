package SOLIDPrinciples.L.Correct;

public class PoliticianTypeA extends Politician{
    private Boolean oratorSkill;
    private Boolean smartWorking;

    public PoliticianTypeA(Party party) {
        super(party);
    }

    public void isGoodOrator(Boolean orator){
        this.oratorSkill = orator;
        System.out.println("Good Orator");
    }
    public void isSmartWorking(Boolean smartWorking){
        this.smartWorking = smartWorking;
        System.out.println("Smart Working");
    }
}
