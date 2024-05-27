package SOLIDPrinciples.O.Correct;

public class PlayRed implements PlayHoli{
    private Model model;
    public PlayRed(Model model){
        this.model = model;
    }
    @Override
    public void ApplyColor(Model model, Color color){
        model.setColor(color);
        this.model = model;
        System.out.println("Model played Holi with: " + this.model.getColor().getColorName() + " color");
    }
}
