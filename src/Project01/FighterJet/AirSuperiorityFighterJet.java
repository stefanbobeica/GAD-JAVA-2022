package Project01.FighterJet;

public class AirSuperiorityFighterJet extends  FighterJetDecorator {
public AirSuperiorityFighterJet(FighterJet jet){
    super(jet);
}

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("->Adding features of a Air Superiority Fighter Jet");
    }
}
