package SOLIDPrinciples.I.Incorrect;

public class Skater implements SkilledHuman{
    @Override
    public void shooting(){
        // Shooting is not my job
    }

    @Override
    public void skating(){
        System.out.println("I'm Good at Skating");
    }

    @Override
    public void protectNation(){
        // I love to work for building my nation
    }

    @Override
    public void winCompetitions(){
        System.out.println("I strive to win every skating competition");
    }
}
