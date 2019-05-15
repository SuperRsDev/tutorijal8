package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;

public class Bus {
    private String maker;
    private String series;
    private int seatNumber;
    private ArrayList<Driver> drivers;

    public Bus(String man, String serija, int i) {
        maker = man;
        series = serija;
        seatNumber = i;
        drivers = new ArrayList<>();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setDriverOne(Driver d) {
        this.drivers.add(0, d);
    }

    public void setDriverTwo(Driver d) {
        this.drivers.add(1, d);
    }

    public Driver getDriverOne() {
        return drivers.get(0);
    }

    public Driver getDriverTwo() {
        return drivers.get(1);
    }
}
