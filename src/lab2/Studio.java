package lab2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio( String nume, Film[] filme){
        this.nume=nume;
        this.filme=filme;
    }

    public String getNume(){ return nume;}
    public Film[] filme(){   return filme;}
}
