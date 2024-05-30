package kendaraan;

public abstract class Kendaraan {
    private String name;
    private String model;
    private String warna;
    private int tahun;

    public void getInfo() {
        System.out.println("Kendaraan: " + name);
        System.out.println("Model : " + model);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public abstract void start();

    public abstract void brake();

    public abstract void stop();
}
