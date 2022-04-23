package Project01.FighterJet;

public class Main{
    public static void main(String[] args) {
        FighterJet stealthJet= new StealthFighterJet(new DefaultFighterJet());
        stealthJet.assemble();
        FighterJet reconnaisanceStealthJet=new ReconnaisanceFighterJet(new StealthFighterJet(new DefaultFighterJet()));
        System.out.println("\n");
        reconnaisanceStealthJet.assemble();
        FighterJet airSuperiorityReconnaissanceStealthJet=new AirSuperiorityFighterJet(new ReconnaisanceFighterJet(new StealthFighterJet(new DefaultFighterJet())));
        System.out.println("\n");
        airSuperiorityReconnaissanceStealthJet.assemble();

    }

}
