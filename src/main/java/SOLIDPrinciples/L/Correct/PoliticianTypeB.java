package SOLIDPrinciples.L.Correct;

public class PoliticianTypeB  extends Politician{
    private Boolean humourSkill;
    private Boolean hardWorking;

    public PoliticianTypeB(Party party) {
        super(party);
    }
    public void isHumorous(Boolean humorous) {
        this.humourSkill = humorous;
        System.out.println("Good Humour Skill");
    }
    public void isHardWorking(Boolean hardWorking){
        this.hardWorking = hardWorking;
        System.out.println("Hard Working");
    }
}
