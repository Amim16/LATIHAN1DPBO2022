public class TimBola{
    // atribut
    private String nama;
    private String asalNegara;
    private int sejak;
    private String pemain;

    // constructor 
    public TimBola(){}

    // constructor dengan parameter
    public TimBola(String name, String country, int since, String player){
        this.nama = name;
        this.asalNegara = country;
        this.sejak = since;
        this.pemain = player;
    }

    // setter
    public void setNama(String name){
        this.nama = name;
    }
    public void setAsalNegara(String country){
        this.asalNegara = country;
    }
    public void setSejak(int since){
        this.sejak = since;
    }
    public void setPemain(String player){
        this.pemain = player;
    }

    // getter
    public String getNama(){
        return nama;
    }
    public String getAsalNegara(){
        return asalNegara;
    }
    public int getSejak(){
        return sejak;
    }
    public String getPemain(){
        return pemain;
    }
}