// Nama          : Agung Surya Permana
// NIM           : 24060121140167
// tanggal      : 7 Maret 2023
// Deskripsi    : Program Kelas Titik

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik;

    Titik() {
        counterTitik = counterTitik+1;
    }

    Titik(float a, float o) {
        absis = a;
        ordinat = o;
        counterTitik = counterTitik+1;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

}