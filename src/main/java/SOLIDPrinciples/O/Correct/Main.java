package SOLIDPrinciples.O.Correct;

public class Main {
    public static void main(String[] args){
        Color color = new Color("Natural");
        Model model = new Model(color);
        PlayRed playRed = new PlayRed(model);
        playRed.ApplyColor(model, new Color("Red"));
        PlayBlue playBlue = new PlayBlue(model);
        playBlue.ApplyColor(model, new Color("Blue"));
        PlayMulti playMulti = new PlayMulti(model);
        playMulti.ApplyColor(model, new Color("Mixed"));
    }
}
