package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void start() {
        System.out.println("Motor " + this.getName() + " dinyalakan");
    }

    @Override
    public void brake() {
        System.out.println("Motor " + this.getName() + " berhenti");
    }
}
