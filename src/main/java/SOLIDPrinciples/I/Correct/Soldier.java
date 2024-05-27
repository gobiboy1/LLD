package SOLIDPrinciples.I.Correct;

public class Soldier implements SoldierInterface {
    @Override
    public void shooting(){
        System.out.println("I'm Good at Shooting");
    }

    @Override
    public void protectNation(){
        System.out.println("Protecting nation is my job");
    }
}
