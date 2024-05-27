package SOLIDPrinciples.S.Correct;

public class ModelChangeBackground {
    private Model model;
    ModelChangeBackground(Model model){
        this.model = model;
    }

    public String changeBackground(Background background){
        this.model.setBackground(background);

        // Logic can be complex or simple for changing different background
        return "Changed the background of model to: "+this.model.getBackground().getBackgroundType();
    }
}
