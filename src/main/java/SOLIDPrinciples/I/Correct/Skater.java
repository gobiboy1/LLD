package SOLIDPrinciples.I.Correct;

public class Skater implements SkaterInterface{
    @Override
    public void skating(){
        System.out.println("I'm good at Skating");
    }
    @Override
    public void winCompetitions(){
        System.out.println("Winning competition in skating is my job");
    }
}
