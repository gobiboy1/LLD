package SOLIDPrinciples.O.Incorrect;

public class PlayHoli {
    private Model model;

    public PlayHoli(Model model){
        this.model = model;
    }

    public void playRed(Model redModel){
        this.model = redModel;
        System.out.println("Model played Holi with: " + this.model.getColor().getColorName() + " color");
    }

    public void playBlue(Model blueModel){
        this.model = blueModel;
        System.out.println("Model played Holi with: " + this.model.getColor().getColorName() + " color");
    }

    public void playGreen(Model greenModel){
        this.model = greenModel;
        System.out.println("Model played Holi with: " + this.model.getColor().getColorName() + " color");
    }

    public void playYellow(Model yellowModel){
        this.model = yellowModel;
        System.out.println("Model played Holi with: " + this.model.getColor().getColorName() + " color");
    }
}
