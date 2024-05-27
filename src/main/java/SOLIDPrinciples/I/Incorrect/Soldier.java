package SOLIDPrinciples.I.Incorrect;

public class Soldier implements SkilledHuman{
    @Override
    public void shooting(){
        System.out.println("I'm Good at Shooting");
    }

    @Override
    public void skating(){
        // Skating is not my job, but doing
    }

    @Override
    public void protectNation(){
        System.out.println("Protecting nation is my job");
    }

    @Override
    public void winCompetitions(){
        // Winning competition in skating is not my job
    }
}
