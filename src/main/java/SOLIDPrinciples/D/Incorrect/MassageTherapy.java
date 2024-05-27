package SOLIDPrinciples.D.Incorrect;

public class MassageTherapy {
    private final Human human;
    private final BatteryMassager massager;

    public MassageTherapy(Human human, BatteryMassager massager) {
        this.human = human;
        this.massager = massager;
    }
}
