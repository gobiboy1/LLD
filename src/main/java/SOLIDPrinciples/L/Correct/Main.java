package SOLIDPrinciples.L.Correct;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Politician> candidates = new ArrayList<>();

        PoliticianTypeA politicianA = new PoliticianTypeA(new Party("BJP"));
        politicianA.isSmartWorking(true);
        politicianA.isGoodOrator(true);
        PoliticianTypeB politicianB = new PoliticianTypeB(new Party("CONGRESS"));
        politicianB.isHardWorking(true);
        politicianB.isHumorous(true);

        candidates.add(politicianA);
        candidates.add(politicianB);

        for(Politician politician : candidates){
            System.out.println(politician.getParty().getPartyName());
        }

    }
}
