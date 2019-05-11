package ba.unsa.etf.rs.tutorijal8;

public class Bus {
    private String proizvodjac;
    private String serija;
    private int brojSjedista;

    public Bus(String man, String serija, int i) {
        proizvodjac = man;
        this.serija = serija;
        brojSjedista = i;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getSerija() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija = serija;
    }

    public int getBrojSjedista() {
        return brojSjedista;
    }

    public void setBrojSjedista(int brojSjedista) {
        this.brojSjedista = brojSjedista;
    }
}
