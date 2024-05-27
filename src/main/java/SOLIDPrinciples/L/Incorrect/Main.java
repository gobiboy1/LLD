package SOLIDPrinciples.L.Incorrect;

public class Main {
    public static void main(String args[]){
        PoliticianTypeA candidate1 = new PoliticianTypeA();
        candidate1.party(new Party("BJP"));
        candidate1.isGoodOrator(true);
        candidate1.isHumorous(false);
        candidate1.isHardWorking(false);
        candidate1.isSmartWorking(true);

        PoliticianTypeB candidate2 = new PoliticianTypeB();
        candidate2.party(new Party("CONGRESS"));
        candidate2.isGoodOrator(false);
        candidate2.isHumorous(true);
        candidate2.isHardWorking(true);
        candidate2.isSmartWorking(false);
    }
}
