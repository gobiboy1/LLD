package SOLIDPrinciples.L.Incorrect;

public class PoliticianTypeA implements Politician{
    private Party party;
    private Boolean oratorSkill;
    private Boolean smartWorking;
    @Override
    public void party(Party party){
        this.party = party;
    }
    @Override
    public void isHumorous(Boolean humorous) {
        throw new AssertionError("Unknown skill");
    }
    @Override
    public void isGoodOrator(Boolean orator){
        this.oratorSkill = orator;
        System.out.println("Good Orator");
    }
    @Override
    public void isSmartWorking(Boolean smartWorking){
        this.smartWorking = smartWorking;
        System.out.println("Smart Working");
    }
    @Override
    public void isHardWorking(Boolean hardWorking){
        throw new AssertionError("Unknown work type");
    }
}
