package com.antaladrien;

public abstract class Jarmu {
    protected int sebesseg;
    private String rendszam;

    public Jarmu(int sebesseg, String rendszam) {
        this.sebesseg = sebesseg;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtottE(int sebesseg);

    public int getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return rendszam + " - " + sebesseg + " km/h";
    }
}
