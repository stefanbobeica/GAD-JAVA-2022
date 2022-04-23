package Project01.FighterJet;

public class ReconnaisanceFighterJet extends  FighterJetDecorator{
    public ReconnaisanceFighterJet(FighterJet fighterJet){
        super(fighterJet);
}
    public void assemble(){
        super.assemble();
        System.out.print("->Adding features of a Reconnaisance Fighter Jet");
    }
}
