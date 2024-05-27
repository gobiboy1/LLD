package SOLIDPrinciples.S.Correct;

public class ModelChangeDress {
    private Model model;
    ModelChangeDress(Model model){
        this.model = model;
    }

    public String changeDress(Dress dress){
        this.model.setDress(dress);

        // Logic can be complex or simple for changing different Dresses
        return "Changed the dress of model to: "+this.model.getDress().getDressType();
    }
}
