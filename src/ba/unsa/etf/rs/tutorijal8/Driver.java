package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;

public class Driver {
    private String ime;
    private String prezime;
    private String jmbg;
    private LocalDate datumRodjenja;
    private LocalDate datumZaposlenja;

    public Driver(String test, String testović, String s, LocalDate localDate, LocalDate now) {
        ime = test;
        prezime = testović;
        jmbg = s;
        datumRodjenja = localDate;
        datumZaposlenja = now;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public LocalDate getDatumZaposlenja() {
        return datumZaposlenja;
    }

    public void setDatumZaposlenja(LocalDate datumZaposlenja) {
        this.datumZaposlenja = datumZaposlenja;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Driver)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Driver c = (Driver) o;

        // Compare the data members and return accordingly
        return this.jmbg.equals(c.jmbg);
    }
}
