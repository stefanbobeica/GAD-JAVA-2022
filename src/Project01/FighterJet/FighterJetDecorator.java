package Project01.FighterJet;

public class FighterJetDecorator implements  FighterJet{

    protected  FighterJet fighterJet;
public FighterJetDecorator(FighterJet jet){
    this.fighterJet=jet;
}
  public void assemble(){
    this.fighterJet.assemble();
  }
}
