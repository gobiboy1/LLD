package SOLIDPrinciples.S.Correct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class STest {
    @Test
    public void Scorrect(){
        Model model = new Model(true, new Dress("Ethnic"), new Background("TempleVibes"));
        ModelChangeDress dress = new ModelChangeDress(model);

        ModelChangeBackground background = new ModelChangeBackground(model);

        Assertions.assertEquals("Changed the dress of model to: Party", dress.changeDress(new Dress("Party")));
        Assertions.assertEquals("Changed the background of model to: BeachVibes", background.changeBackground(new Background("BeachVibes")));
    }
}
