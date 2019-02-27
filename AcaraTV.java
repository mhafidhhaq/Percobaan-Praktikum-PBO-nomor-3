package acaratv;

public class AcaraTV {
    private String stasiuntv;
    private String acara;
    
    public String getStasiuntv(){
        return stasiuntv;
    }
    
    public void setStasiuntv(String stasiuntv){
        this.stasiuntv = stasiuntv;
    }

    public String getAcara(){
        return acara;
    }
    
    public void setAcara(String acara){
        this.acara = acara;
    }
    
    public void cetak(){
        System.out.println("Acara " + acara + " Stasiun TV " + stasiuntv);
    }
    
}
