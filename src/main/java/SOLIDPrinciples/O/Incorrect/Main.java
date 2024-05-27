package SOLIDPrinciples.O.Incorrect;

public class Main {
    public static void main(String[] args) {
        Color color = new Color("natural");
        Model model = new Model(color);
        PlayHoli playHoli = new PlayHoli(model);
        model.setColor(new Color("red"));
        playHoli.playRed(model);
        model.setColor(new Color("blue"));
        playHoli.playBlue(model);
        model.setColor(new Color("green"));
        playHoli.playGreen(model);
        model.setColor(new Color("yellow"));
        playHoli.playYellow(model);
    }
}
