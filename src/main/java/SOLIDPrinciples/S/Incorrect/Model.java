package SOLIDPrinciples.S.Incorrect;

public class Model {
    private boolean makeup;
    private String dress;
    private String background;

    public Model(boolean makeup, String dress, String background){
        this.makeup = makeup;
        this.dress = dress;
        this.background = background;
    }

    public void changeDress(String dress){
        this.dress = dress;
        System.out.println("Changed the dress of model to: "+ this.dress);
    }

    public void changeBackground(String background){
        this.background = background;
        System.out.println("Changed the background of model to: "+ this.background);
    }
}
