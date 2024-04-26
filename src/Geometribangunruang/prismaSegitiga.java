package Geometribangunruang;

import Geometribangundatar.Segitiga;
import coba3.Bangunruang;

public class prismaSegitiga extends Segitiga implements Bangunruang {

    private double tPrisma;

    public prismaSegitiga(double alas, double tinggi, double tPrisma) {
        super(alas, tinggi);
        this.tPrisma = tPrisma;
    }

    public double getTPrisma() {
        return tPrisma;
    }

    public void setTPrisma(double tPrisma) {
        this.tPrisma = tPrisma;
    }

    @Override
    public double Volume() {
        return 0.5 * Luas() * tPrisma;
    }
}
