package lab2;

public class Film {
    private  Integer anAparatie;
    private  String nume;
    private  Actor[] actori;
    public Film(Integer anAparatie, String nume, Actor[] actori){
        this.anAparatie=anAparatie;
        this.nume=nume;
        this.actori=actori;
    }
    public Integer getAnAparatie(){ return anAparatie;}
    public String getNume(){return nume;}
    public Actor[] getActori(){return actori;}
}
