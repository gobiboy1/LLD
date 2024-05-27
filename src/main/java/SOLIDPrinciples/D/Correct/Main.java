package SOLIDPrinciples.D.Correct;

public class Main {
    public static void main(String args[]){
        LivingBeingsMassage human = new Human("Leg Massage To Human");
        Massager massager1 = new BatteryMassager(true);
        MassageTherapy massageTherapy1 = new MassageTherapy(human, massager1);

        LivingBeingsMassage cat = new Cat("Neck Massage To Cat");
        Massager massager2 = new WiredMassager(true);
        MassageTherapy massageTherapy2 = new MassageTherapy(cat, massager2);
    }
}
