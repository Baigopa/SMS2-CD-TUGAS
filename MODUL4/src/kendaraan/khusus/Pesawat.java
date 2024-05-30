package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void start() {
        System.out.println("Menyalakan pesawat " + this.getName());
    }

    @Override
    public void brake() {
        System.out.println("Pesawat " + this.getName() + " berhenti");
    }

    @Override
    public void stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}
