package com.antaladrien;

public class Robogo extends Jarmu implements KisGepjarmu {
    private int maxSebesseg;

    public Robogo(String rendszam, int aktsebesseg, int maxsebesseg) {
        super(aktsebesseg, rendszam);
        this.maxSebesseg = maxsebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebesseg) {
        return this.sebesseg > sebesseg ? true : false;
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return this.maxSebesseg > sebesseg ? false : true;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
}
