package SOLIDPrinciples.L.Incorrect;

public class PoliticianTypeB implements Politician{
    private Party party;
    private Boolean humourSkill;
    private Boolean hardWorking;
    @Override
    public void party(Party party){
        this.party = party;
    }
    @Override
    public void isHumorous(Boolean humorous) {
        this.humourSkill = humorous;
        System.out.println("Good Humour Skill");
    }
    @Override
    public void isGoodOrator(Boolean orator){
        throw new AssertionError("Unknown skill");
    }
    @Override
    public void isSmartWorking(Boolean smartWorking){
        throw new AssertionError("Unknown work type");

    }
    @Override
    public void isHardWorking(Boolean hardWorking){
        this.hardWorking = hardWorking;
        System.out.println("Hard Working");
    }
}