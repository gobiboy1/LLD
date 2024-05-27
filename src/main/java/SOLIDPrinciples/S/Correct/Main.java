package SOLIDPrinciples.S.Correct;

public class Main {
    public static void main(String[] args) {
        Model model = new Model(true, new Dress("Ethnic"), new Background("TempleVibes"));
        ModelChangeDress dress = new ModelChangeDress(model);
        System.out.println(dress.changeDress(new Dress("Party")));
        ModelChangeBackground background = new ModelChangeBackground(model);
        System.out.println(background.changeBackground(new Background("BeachVibes")));
    }
}
