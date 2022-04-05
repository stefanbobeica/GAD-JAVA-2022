package lab2;

public class Premiu {

    private String nume;
    private Integer an;

    public Premiu(String nume, int an){
        this.nume=nume;
        this.an=an;
    }
    String getNume(){ return this.nume;}
    Integer getAn(){return an;}
}
