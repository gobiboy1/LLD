package SOLIDPrinciples.D.Incorrect;

public class Main {
    public static void main(String args[]){
        Human human = new Human("Leg Massage");
        BatteryMassager batteryMassager = new BatteryMassager(true);
        MassageTherapy therapy = new MassageTherapy(human, batteryMassager);
    }
}
