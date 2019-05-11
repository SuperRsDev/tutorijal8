package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;

public class TransportDAO {
    private static TransportDAO instance;
    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();

    public static TransportDAO getInstance() {
        if(TransportDAO.instance == null) {
            TransportDAO.instance = new TransportDAO();
        }
        return instance;
    }

    public void addDriver(Driver driver) throws IllegalArgumentException {
        var exists = drivers.contains(driver);
        if(exists) {
            throw new IllegalArgumentException("Taj vozač već postoji!");
        }
        drivers.add(driver);
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public ArrayList<Bus> getBusses() {
        return buses;
    }

    public void deleteBus(Bus bus) {
        buses.remove(bus);
    }

    public void deleteDriver(Driver driver) {
        drivers.remove(driver);
    }
}
