package SOLIDPrinciples.S.Correct;

public class Model {
    private boolean makeup;
    private Dress dress;
    private Background background;

    public Model(boolean makeup, Dress dress, Background background){
        this.makeup = makeup;
        this.dress = dress;
        this.background = background;
    }

    public boolean isMakeup() {
        return makeup;
    }

    public Dress getDress() {
        return dress;
    }

    public Background getBackground() {
        return background;
    }

    public void setMakeup(boolean makeup) {
        this.makeup = makeup;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
}
