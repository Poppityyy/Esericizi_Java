public class Veicolo {
    // Fatale Flavio 4D 15/02/2022
    public static void main(String[] args) {
       Veicolo mcLarenP1 = new Veicolo("FG932AD", 3799, "McLaren", "P1", 2022);
       Veicolo abarth500 = new Veicolo("EH674GD", 1368, "Abarth", "500", 2016);
       Veicolo opelAdam = new Veicolo("ER344AA", 1200, "Opel", "Adam", 2017);
       System.out.println(mcLarenP1.toString());
       System.out.println(abarth500.toString());
       System.out.println(opelAdam.toString());
    }

    private String targa;
    private int cilindrata;
    private String marca;
    private String modello;
    private int anno;

    public Veicolo(String targa, int cilindrata, String marca, String modello, int anno){
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public Veicolo(Veicolo veicolo) {
        this.targa=veicolo.getTarga();
        this.cilindrata=veicolo.getCilindrata();
        this.marca=veicolo.getMarca();
        this.modello=veicolo.getModello();
        this.anno=veicolo.getAnno();
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno){
        this.anno = anno;
    }

    public String toString(){
        return "Targa: "+ getTarga()+ " Cilindrata: " + getCilindrata() +" Marca: "+ getMarca() + " Modello: " + getModello() + " Anno: " + getAnno();
    }
}