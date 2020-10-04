package com.antaladrien;

public class AudiS8 extends Jarmu {
    private boolean lezerblokkolo;

    public AudiS8(String rendszam, int sebesseg, boolean lezerblokkolo) {
        super(sebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebesseg) {
        return (!this.lezerblokkolo && sebesseg < this.sebesseg) ? true : false;
    }

    public boolean isLezerblokkolo() {
        return lezerblokkolo;
    }

    public void setLezerblokkolo(boolean lezerblokkolo) {
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public String toString() {
        return "AudiS8: " + super.toString();
    }
}
