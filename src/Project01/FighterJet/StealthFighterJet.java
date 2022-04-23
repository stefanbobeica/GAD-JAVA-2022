package Project01.FighterJet;

public class StealthFighterJet extends FighterJetDecorator {
    public StealthFighterJet(FighterJet jet){
        super(jet);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("->Adding features of a Stealth Fighter Jet");
    }
}
